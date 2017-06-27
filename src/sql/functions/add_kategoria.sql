CREATE OR REPLACE FUNCTION add_kategoria (nazwa TEXT) 
RETURNS boolean as $$
   DECLARE
      v_name TEXT;
      v_id_cat bigint;
   BEGIN
	v_name := nazwa;
   INSERT INTO category (id, name) VALUES (default, v_name);
     RETURN TRUE;
      
   END; 
   $$ LANGUAGE plpgsql;