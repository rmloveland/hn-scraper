# HN Scraper

Scrapes the HN frontpage for article/thread titles.

Written as a Clojure and Enlive learning exercise.

(I know you're supposed to use the Firebase API instead of scraping -
this is for playing with Enlive (a library for DOM manipulation with
CSS selectors).

## Usage

```
$ lein uberjar
# ... builds standalone JAR file

$ ./run.sh
# There's a run.bat but I haven't fully tested it yet

Why Japan’s Rail Workers Point at Things
Earth is a ‘dwarf planet’ because it has not cleared its orbit
Idris 1.0 Released
Raganwald's Tooling for Turing Machines
Iosevka – A Typeface for Code, from Code
Open Philanthropy Project awards a grant of $30M to OpenAI
Ask HN: What do you want to see in Ubuntu 17.10?
Fourteen Months with Clojure
Unpaired Image-to-Image Translation using Cycle-Consistent Adversarial Networks
LastPass release fix for DOM manipulation vulnerability
Open Source Needs FPGAs; FPGAs Need an On-Ramp
Fuchsia: a new operating system
Robinhood stock trading app valued at $1.3B with big raise from DST
Launch HN: Tress (YC W17) – Online community for black women's hairstyles
Shutting down CodePlex
Why is this Go faster than the equivalent Java?
Starting a Hardware Company with $60K
A database built like an operating system: the architecture of FaunaDB
Show HN: My Interactive ClojureScript book
A startup is filling SF's empty luxury rentals
Trolls are winning the internet, technologists say
How “engagement” made the web a less engaging place
Thirteen Years of Bad Game Code
Keeping David MacKay's 'Sustainable Energy – without the hot air' up-to-date
A step-by-step guide to building a simple chess AI
Apollo Client 1.0: A flexible, community-focused JavaScript GraphQL client
Programmable Fax – API for sending and receiving faxes
Wikileaks releases CIA's Marble: Malware obfuscation tools
How to Write Portable C Without Complicating Your Build
Koomey's law
```
