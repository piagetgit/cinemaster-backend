./mvnw clean package
cd ./api-gateway
docker build -t api-gateway .
cd ../service-discovery-server
docker build -t service-discovery-server .
cd ../film-service
docker build -t film-service .
cd ../user-service
docker build -t user-service .
cd ../payment-service
docker build -t payment-service .
cd ..
