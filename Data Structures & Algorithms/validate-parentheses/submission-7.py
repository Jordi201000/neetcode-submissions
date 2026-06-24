class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        
        for i in s:
            if(i=='(' or i=='{' or i == '['):
                stack.append(i)
            elif(i==']'):
                if(stack):
                    x=stack.pop()
                    if(x!='['):
                        return False
                    else:
                        continue

                return False
            elif(i=='}'):
                if(stack):
                    x=stack.pop()
                    if(x!='{'):
                        return False
                    else:
                        continue
                return False
            elif(i==')'):
                if(stack):
                    x=stack.pop()
                    if(x!='('):
                        return False
                    else:
                        continue
                return False
            else:
                continue
        if(stack):
            return False
        return True
            