# 🚀 Generate Parentheses – My Learning Journey

## 📌 Problem Statement
Given an integer `n`, generate all possible combinations of well-formed parentheses (or braces) of length `2n`.

---

## 🧠 My Approach

While solving this problem, I explored multiple approaches to understand recursion and backtracking deeply.

---

## 🔹 Approach 1: Brute Force (Generate All + Filter)

- Generate all possible strings of length `2n`
- At each step, choose either `{` or `}`
- Total combinations = **2^(2n)**
- Filter valid strings using a balance check

### ✔ Learnings
- Understanding recursion trees
- Generating all possible combinations

### ❌ Limitations
- Generates many invalid strings
- Inefficient for larger inputs

---

## 🔹 Approach 2: Optimized Backtracking (Learned via References)

Instead of generating all possibilities, I used constraints to build only valid strings:

- Add `{` only if `open < n`
- Add `}` only if `close < open`

### ✔ Advantages
- Avoids invalid combinations
- Efficient compared to brute force
- Uses pruning in recursion

---

## 🌳 Recursion Insight

- Each recursive call represents a state `(string, open, close)`
- Valid branches are explored based on constraints
- Invalid paths are avoided early

---

## 🔤 Lexicographical Order

By always exploring:
1. `{` first  
2. `}` next  

The output is naturally in **lexicographical order** without sorting.

---

## 📌 Example (n = 3)
{{{}}}
{{}{}}
{{}}{}
{}{{}}
{}{}{}

## 📚 Key Takeaways
Start with brute force to understand the problem
Optimize using backtracking and constraints
Avoid invalid states early (pruning)
Recursion becomes efficient when guided by conditions
🔗 References

I referred to external resources to understand the optimized backtracking approach.


## 📈 Conclusion

This problem helped me strengthen my understanding of:

Recursion
Backtracking
Efficient problem-solving techniques

## ⭐ If you found this useful, feel free to star the repo!

