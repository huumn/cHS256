(library (chs256 chs256)
  (export
     hs256
  )
  (import
    (scheme)
  )


  (define lib (load-shared-object "./lib/chs256/hmacsha256.so"))

  (define hs256
    (foreign-procedure "hs256" (string string) string))
 
 
 )
