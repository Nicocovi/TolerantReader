# TolerantReader_Example

Example to verify relevant Tolerant Reader Use Cases from SXXXX Servicearchitecture Guideline.

## Test Endpoints

Link: http://localhost:9090/codenotfound/ws/orderhistory
```
<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:ns1="http://codenotfound.com/types/orderhistory">
	<soapenv:Body>
		<ns1:getOrderHistoryRequest>
			<ns1:userId></ns1:userId>
		</ns1:getOrderHistoryRequest>
	</soapenv:Body>
</soapenv:Envelope>
```
