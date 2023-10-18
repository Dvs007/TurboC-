class rev:
    string = ''

    def get_String(self):
        self.string = input("Enter string")

    def print_String(self):
        words = self.string.split(' ')
        rev_words = ' '.join(reversed(words))
        print(rev_words.lower())
    
obj = rev() 
obj.get_String()
obj.print_String()