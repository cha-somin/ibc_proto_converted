# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/stakeibc/address_unbonding.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'stride/stakeibc/address_unbonding.proto\x12\x0fstride.stakeibc\x1a\x14gogoproto/gogo.proto\"\xad\x02\n\x10\x41\x64\x64ressUnbonding\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x1a\n\x08receiver\x18\x02 \x01(\tR\x08receiver\x12\x38\n\x18unbonding_estimated_time\x18\x03 \x01(\tR\x16unbondingEstimatedTime\x12\x46\n\x06\x61mount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12\x14\n\x05\x64\x65nom\x18\x05 \x01(\tR\x05\x64\x65nom\x12(\n\x10\x63laim_is_pending\x18\x08 \x01(\x08R\x0e\x63laimIsPending\x12!\n\x0c\x65poch_number\x18\t \x01(\x04R\x0b\x65pochNumberB\xbc\x01\n\x13\x63om.stride.stakeibcB\x15\x41\x64\x64ressUnbondingProtoP\x01Z1github.com/Stride-Labs/stride/v9/x/stakeibc/types\xa2\x02\x03SSX\xaa\x02\x0fStride.Stakeibc\xca\x02\x0fStride\\Stakeibc\xe2\x02\x1bStride\\Stakeibc\\GPBMetadata\xea\x02\x10Stride::Stakeibcb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.stakeibc.address_unbonding_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.stride.stakeibcB\025AddressUnbondingProtoP\001Z1github.com/Stride-Labs/stride/v9/x/stakeibc/types\242\002\003SSX\252\002\017Stride.Stakeibc\312\002\017Stride\\Stakeibc\342\002\033Stride\\Stakeibc\\GPBMetadata\352\002\020Stride::Stakeibc'
  _ADDRESSUNBONDING.fields_by_name['amount']._options = None
  _ADDRESSUNBONDING.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_ADDRESSUNBONDING']._serialized_start=83
  _globals['_ADDRESSUNBONDING']._serialized_end=384
# @@protoc_insertion_point(module_scope)
