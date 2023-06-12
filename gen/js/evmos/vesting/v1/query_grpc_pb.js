// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var evmos_vesting_v1_query_pb = require('../../../evmos/vesting/v1/query_pb.js');
var cosmos_base_v1beta1_coin_pb = require('../../../cosmos/base/v1beta1/coin_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');

function serialize_evmos_vesting_v1_QueryBalancesRequest(arg) {
  if (!(arg instanceof evmos_vesting_v1_query_pb.QueryBalancesRequest)) {
    throw new Error('Expected argument of type evmos.vesting.v1.QueryBalancesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_QueryBalancesRequest(buffer_arg) {
  return evmos_vesting_v1_query_pb.QueryBalancesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_evmos_vesting_v1_QueryBalancesResponse(arg) {
  if (!(arg instanceof evmos_vesting_v1_query_pb.QueryBalancesResponse)) {
    throw new Error('Expected argument of type evmos.vesting.v1.QueryBalancesResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_evmos_vesting_v1_QueryBalancesResponse(buffer_arg) {
  return evmos_vesting_v1_query_pb.QueryBalancesResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Query defines the gRPC querier service.
var QueryService = exports.QueryService = {
  // Balances retrieves the unvested, vested and locked tokens for a vesting account
balances: {
    path: '/evmos.vesting.v1.Query/Balances',
    requestStream: false,
    responseStream: false,
    requestType: evmos_vesting_v1_query_pb.QueryBalancesRequest,
    responseType: evmos_vesting_v1_query_pb.QueryBalancesResponse,
    requestSerialize: serialize_evmos_vesting_v1_QueryBalancesRequest,
    requestDeserialize: deserialize_evmos_vesting_v1_QueryBalancesRequest,
    responseSerialize: serialize_evmos_vesting_v1_QueryBalancesResponse,
    responseDeserialize: deserialize_evmos_vesting_v1_QueryBalancesResponse,
  },
};

exports.QueryClient = grpc.makeGenericClientConstructor(QueryService);
