(("name" . "chs256")
("version" . "0.1.0")
("description" . "HMAC-SHA256 for Chez Scheme")
("keywords")
("author" 
    ("Michael Savage" "guenchi"))
("private" . #f)
("scripts" 
    ("build" . "cd ./lib/chs256/src && cc -o3 -fPIC -shared hmacsha256.c sha256.c -o ../hmacsha256.so"))
("dependencies")
("devDependencies"))
