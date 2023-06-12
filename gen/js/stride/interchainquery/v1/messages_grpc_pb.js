// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var stride_interchainquery_v1_messages_pb = require('../../../stride/interchainquery/v1/messages_pb.js');
var gogoproto_gogo_pb = require('../../../gogoproto/gogo_pb.js');
var cosmos_proto_cosmos_pb = require('../../../cosmos_proto/cosmos_pb.js');
var google_api_annotations_pb = require('../../../google/api/annotations_pb.js');
var tendermint_crypto_proof_pb = require('../../../tendermint/crypto/proof_pb.js');

function serialize_stride_interchainquery_v1_MsgSubmitQueryResponse(arg) {
  if (!(arg instanceof stride_interchainquery_v1_messages_pb.MsgSubmitQueryResponse)) {
    throw new Error('Expected argument of type stride.interchainquery.v1.MsgSubmitQueryResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_interchainquery_v1_MsgSubmitQueryResponse(buffer_arg) {
  return stride_interchainquery_v1_messages_pb.MsgSubmitQueryResponse.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_stride_interchainquery_v1_MsgSubmitQueryResponseResponse(arg) {
  if (!(arg instanceof stride_interchainquery_v1_messages_pb.MsgSubmitQueryResponseResponse)) {
    throw new Error('Expected argument of type stride.interchainquery.v1.MsgSubmitQueryResponseResponse');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_stride_interchainquery_v1_MsgSubmitQueryResponseResponse(buffer_arg) {
  return stride_interchainquery_v1_messages_pb.MsgSubmitQueryResponseResponse.deserializeBinary(new Uint8Array(buffer_arg));
}


// Msg defines the interchainquery Msg service.
var MsgService = exports.MsgService = {
  // SubmitQueryResponse defines a method for submit query responses.
submitQueryResponse: {
    path: '/stride.interchainquery.v1.Msg/SubmitQueryResponse',
    requestStream: false,
    responseStream: false,
    requestType: stride_interchainquery_v1_messages_pb.MsgSubmitQueryResponse,
    responseType: stride_interchainquery_v1_messages_pb.MsgSubmitQueryResponseResponse,
    requestSerialize: serialize_stride_interchainquery_v1_MsgSubmitQueryResponse,
    requestDeserialize: deserialize_stride_interchainquery_v1_MsgSubmitQueryResponse,
    responseSerialize: serialize_stride_interchainquery_v1_MsgSubmitQueryResponseResponse,
    responseDeserialize: deserialize_stride_interchainquery_v1_MsgSubmitQueryResponseResponse,
  },
};

exports.MsgClient = grpc.makeGenericClientConstructor(MsgService);
