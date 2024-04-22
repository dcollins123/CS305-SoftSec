# CS305
Software Security

Briefly summarize your client, Artemis Financial, and their software requirements. Who was the client? What issue did they want you to address?

The client was Artemis Financial, a consulting company who wanted to modernize their systems by inceasing their data security. Specifically, they wanted to secure their communications by adding file verification methods. 

What did you do very well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall wellbeing?

What I did well was elimainating all vulnerabilities in the final product. It is important to code securely to prevent unauthorized access, this helps ensure the trust of Artemis Financials’ customers by creating a secure, reliable product. A single data breach may be enough to damage a company’s hard earned trust, and this product was designed to be secure, now and in the future. 

What part of the vulnerability assessment was challenging or helpful to you?

The first OWASP Dependency check report was quite challenging at first with 120 vulnerabilities identified. But after updating and upgrading Java and Spring Boots to the latest versions, I was relieved to see that almost of the vulnerabilities were removed. The value of updating cannot be understated. 

How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

By upgrading Java and other frameworks, I ensured that the program’s foundations had the most current security features. I used HTTPS to secure data transmissions by generating a SSL certificate and configuring it with Spring Boot to provide a secure server port (8443). Lastly, scanning for vulnerabilities with Maven Dependency Check then refactoring the code to eliminate vulnerable dependencies adds another layer of security to this program. 

How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?

I made to continuously test the code after refactoring the problem line; if the new code ran without errors, I then would perform a depedenecy check to ensure no new issues came about. 

What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

Understanding OWASP dependency checks and reports made it clear how important it is to stay up to date with each part of your code. Learning how to conduct a thorough vulnerability assessment will help me develope and identify problems, and create secure code. 

