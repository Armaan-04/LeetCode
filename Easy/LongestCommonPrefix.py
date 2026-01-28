class Solution(object):
    def longestCommonPrefix(self, strs):

        if not strs:
            return ""

        # Start with the first string as prefix
        prefix = strs[0]

        # Compare prefix with each string
        for s in strs[1:]:
            # Reduce prefix until it matches the start of s
            while not s.startswith(prefix):
                prefix = prefix[:-1]
                if prefix == "":
                    return ""

        return prefix