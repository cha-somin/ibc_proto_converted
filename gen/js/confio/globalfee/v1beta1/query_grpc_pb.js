// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var confio_globalfee_v1beta1_query_pb = require('../../../confio/globalfee/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');

function serialize_confio_globalfee_v1beta1_QueryMinimumGasPricesRequest(arg) {
  if (!(arg instanceof confio_globalfee_v1beta1_query_pb.QueryMinimumGasPricesRequest)) {
    throw new Error('Expected argument of type confio.globalfee.v1beta1.QueryMinimumGasPricesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_globalfee_v1beta1_QueryMinimumGasPricesRequest(buffer_arg) {
  return confio_globalfee_v1beta1_query_pb.QueryMinimumGasPricesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse(arg) {
  if (!(arg instanceof confio_globalfee_v1beta1_query_pb.QueryMinimumGasPricesResponse)) {
    throw new Error('Expected argument of type confio.globalfee.v1beta1.QueryMinimumGasPricesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse(buffer_arg) {
  return confio_globalfee_v1beta1_query_pb.QueryMinimumGasPricesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  minimumGasPrices: {
    path: '/confio.globalfee.v1beta1.Query/MinimumGasPrices',
    requestStream: false,
    responseStream: false,
    requestType: confio_globalfee_v1beta1_query_pb.QueryMinimumGasPricesRequest,
    responseType: confio_globalfee_v1beta1_query_pb.QueryMinimumGasPricesResponse,
    requestSerialize: serialize_confio_globalfee_v1beta1_QueryMinimumGasPricesRequest,
    requestDeserialize: deserialize_confio_globalfee_v1beta1_QueryMinimumGasPricesRequest,
    responseSerialize: serialize_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse,
    responseDeserialize: deserialize_confio_globalfee_v1beta1_QueryMinimumGasPricesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
