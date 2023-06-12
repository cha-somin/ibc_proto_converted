# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/node/v1/node.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from sentinel.types.v1 import status_pb2 as sentinel_dot_types_dot_v1_dot_status__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bsentinel/node/v1/node.proto\x12\x10sentinel.node.v1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1esentinel/types/v1/status.proto\"\xc3\x02\n\x04Node\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x1a\n\x08provider\x18\x02 \x01(\tR\x08provider\x12\x61\n\x05price\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x05price\x12,\n\nremote_url\x18\x04 \x01(\tB\r\xe2\xde\x1f\tRemoteURLR\tremoteUrl\x12\x31\n\x06status\x18\x05 \x01(\x0e\x32\x19.sentinel.types.v1.StatusR\x06status\x12\x41\n\tstatus_at\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x08statusAtB\xc4\x01\n\x14\x63om.sentinel.node.v1B\tNodeProtoP\x01Z7github.com/sentinel-official/hub/x/node/legacy/v1/types\xa2\x02\x03SNX\xaa\x02\x10Sentinel.Node.V1\xca\x02\x10Sentinel\\Node\\V1\xe2\x02\x1cSentinel\\Node\\V1\\GPBMetadata\xea\x02\x12Sentinel::Node::V1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.node.v1.node_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.sentinel.node.v1B\tNodeProtoP\001Z7github.com/sentinel-official/hub/x/node/legacy/v1/types\242\002\003SNX\252\002\020Sentinel.Node.V1\312\002\020Sentinel\\Node\\V1\342\002\034Sentinel\\Node\\V1\\GPBMetadata\352\002\022Sentinel::Node::V1\310\341\036\000\250\342\036\000'
  _NODE.fields_by_name['price']._options = None
  _NODE.fields_by_name['price']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _NODE.fields_by_name['remote_url']._options = None
  _NODE.fields_by_name['remote_url']._serialized_options = b'\342\336\037\tRemoteURL'
  _NODE.fields_by_name['status_at']._options = None
  _NODE.fields_by_name['status_at']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_NODE']._serialized_start=169
  _globals['_NODE']._serialized_end=492
# @@protoc_insertion_point(module_scope)
