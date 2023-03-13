cd cinemaster-commons
./mvnw clean package &
cd ../api-gateway
./mvnw clean package &
docker build -t api-gateway .
cd ../service-discovery-server
./mvnw clean package &
docker build -t service-discovery-server .
cd ../film-service
./mvnw clean package &
docker build -t film-service .
cd ../user-service
./mvnw clean package &
docker build -t user-service .
cd ../payment-service
./mvnw clean package &
docker build -t payment-service .
cd ..
