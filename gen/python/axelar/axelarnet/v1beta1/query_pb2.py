# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/axelarnet/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from axelar.axelarnet.v1beta1 import types_pb2 as axelar_dot_axelarnet_dot_v1beta1_dot_types__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from axelar.nexus.v1beta1 import query_pb2 as axelar_dot_nexus_dot_v1beta1_dot_query__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$axelar/axelarnet/v1beta1/query.proto\x12\x18\x61xelar.axelarnet.v1beta1\x1a\x14gogoproto/gogo.proto\x1a$axelar/axelarnet/v1beta1/types.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a axelar/nexus/v1beta1/query.proto\" \n\x1ePendingIBCTransferCountRequest\"\xec\x01\n\x1fPendingIBCTransferCountResponse\x12\x83\x01\n\x12transfers_by_chain\x18\x01 \x03(\x0b\x32O.axelar.axelarnet.v1beta1.PendingIBCTransferCountResponse.TransfersByChainEntryB\x04\xc8\xde\x1f\x00R\x10transfersByChain\x1a\x43\n\x15TransfersByChainEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\rR\x05value:\x02\x38\x01\x42\xe8\x01\n\x1c\x63om.axelar.axelarnet.v1beta1B\nQueryProtoP\x01Z6github.com/axelarnetwork/axelar-core/x/axelarnet/types\xa2\x02\x03\x41\x41X\xaa\x02\x18\x41xelar.Axelarnet.V1beta1\xca\x02\x18\x41xelar\\Axelarnet\\V1beta1\xe2\x02$Axelar\\Axelarnet\\V1beta1\\GPBMetadata\xea\x02\x1a\x41xelar::Axelarnet::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.axelarnet.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.axelar.axelarnet.v1beta1B\nQueryProtoP\001Z6github.com/axelarnetwork/axelar-core/x/axelarnet/types\242\002\003AAX\252\002\030Axelar.Axelarnet.V1beta1\312\002\030Axelar\\Axelarnet\\V1beta1\342\002$Axelar\\Axelarnet\\V1beta1\\GPBMetadata\352\002\032Axelar::Axelarnet::V1beta1\310\341\036\000'
  _PENDINGIBCTRANSFERCOUNTRESPONSE_TRANSFERSBYCHAINENTRY._options = None
  _PENDINGIBCTRANSFERCOUNTRESPONSE_TRANSFERSBYCHAINENTRY._serialized_options = b'8\001'
  _PENDINGIBCTRANSFERCOUNTRESPONSE.fields_by_name['transfers_by_chain']._options = None
  _PENDINGIBCTRANSFERCOUNTRESPONSE.fields_by_name['transfers_by_chain']._serialized_options = b'\310\336\037\000'
  _globals['_PENDINGIBCTRANSFERCOUNTREQUEST']._serialized_start=204
  _globals['_PENDINGIBCTRANSFERCOUNTREQUEST']._serialized_end=236
  _globals['_PENDINGIBCTRANSFERCOUNTRESPONSE']._serialized_start=239
  _globals['_PENDINGIBCTRANSFERCOUNTRESPONSE']._serialized_end=475
  _globals['_PENDINGIBCTRANSFERCOUNTRESPONSE_TRANSFERSBYCHAINENTRY']._serialized_start=408
  _globals['_PENDINGIBCTRANSFERCOUNTRESPONSE_TRANSFERSBYCHAINENTRY']._serialized_end=475
# @@protoc_insertion_point(module_scope)
