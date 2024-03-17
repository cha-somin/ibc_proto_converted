// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var gaia_globalfee_v1beta1_query_pb = require('../../../gaia/globalfee/v1beta1/query_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var gaia_globalfee_v1beta1_genesis_pb = require('../../../gaia/globalfee/v1beta1/genesis_pb.js');

function serialize_gaia_globalfee_v1beta1_QueryParamsRequest(arg) {
  if (!(arg instanceof gaia_globalfee_v1beta1_query_pb.QueryParamsRequest)) {
    throw new Error('Expected argument of type gaia.globalfee.v1beta1.QueryParamsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gaia_globalfee_v1beta1_QueryParamsRequest(buffer_arg) {
  return gaia_globalfee_v1beta1_query_pb.QueryParamsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_gaia_globalfee_v1beta1_QueryParamsResponse(arg) {
  if (!(arg instanceof gaia_globalfee_v1beta1_query_pb.QueryParamsResponse)) {
    throw new Error('Expected argument of type gaia.globalfee.v1beta1.QueryParamsResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_gaia_globalfee_v1beta1_QueryParamsResponse(buffer_arg) {
  return gaia_globalfee_v1beta1_query_pb.QueryParamsResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  params: {
    path: '/gaia.globalfee.v1beta1.Query/Params',
    requestStream: false,
    responseStream: false,
    requestType: gaia_globalfee_v1beta1_query_pb.QueryParamsRequest,
    responseType: gaia_globalfee_v1beta1_query_pb.QueryParamsResponse,
    requestSerialize: serialize_gaia_globalfee_v1beta1_QueryParamsRequest,
    requestDeserialize: deserialize_gaia_globalfee_v1beta1_QueryParamsRequest,
    responseSerialize: serialize_gaia_globalfee_v1beta1_QueryParamsResponse,
    responseDeserialize: deserialize_gaia_globalfee_v1beta1_QueryParamsResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
