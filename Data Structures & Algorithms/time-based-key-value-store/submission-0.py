class TimeMap:

    def __init__(self):
        self.names = {}#hash map names to list


    def set(self, key: str, value: str, timestamp: int) -> None:
        if (key not in self.names):
            self.names[key]=[]
        self.names[key].append((value,timestamp))


    def get(self, key: str, timestamp: int) -> str:
        output =""
        l=0
        val=self.names.get(key,[])
        r=len(val)-1
        m=0
        while l<=r:
            m = (r+l)//2
            if val[m][1]<=timestamp:
                output = val[m][0]
                l=m+1
            else:
                r=m-1

        return output