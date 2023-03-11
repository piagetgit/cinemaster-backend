cd cinemaster-commons
./mvnw clean -U install &
cd ../api-gateway
./mvnw clean -U install &
docker build -t api-gateway .
cd ../film-service
./mvnw clean -U install &
docker build -t film-service .
cd ../user-service
./mvnw clean -U install &
docker build -t user-service .
cd ../payment-service
./mvnw clean -U install &
docker build -t payment-service .
cd ../service-discovery-server
./mvnw clean -U install &
docker build -t service-discovery-server .
cd ..

