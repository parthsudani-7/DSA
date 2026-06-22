class TrieNode {
public:
    TrieNode* nxt[26];
    bool endMark;

    TrieNode() {
        for(int i = 0; i < 26; i++)
            nxt[i] = NULL;
        endMark = false;
    }
};

class Trie {
public:
    TrieNode* root;

    Trie() {
        root = new TrieNode();
    }

    void insert(string word) {
        TrieNode* cur = root;

        for(char c : word) {
            int id = c - 'a';
            if(cur->nxt[id] == NULL)
                cur->nxt[id] = new TrieNode();

            cur = cur->nxt[id];
        }
        cur->endMark = true;
    }

    bool search(string word) {
        TrieNode* cur = root;

        for(char c : word) {
            int id = c - 'a';
            if(cur->nxt[id] == NULL)
                return false;

            cur = cur->nxt[id];
        }
        return cur->endMark;
    }

    bool startsWith(string prefix) {
        TrieNode* cur = root;

        for(char c : prefix) {
            int id = c - 'a';
            if(cur->nxt[id] == NULL)
                return false;

            cur = cur->nxt[id];
        }
        return true;
    }
};