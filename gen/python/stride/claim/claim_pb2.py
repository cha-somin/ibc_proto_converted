# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/claim/claim.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18stride/claim/claim.proto\x12\x0cstride.claim\x1a\x14gogoproto/gogo.proto\"\xaa\x02\n\x0b\x43laimRecord\x12L\n\x12\x61irdrop_identifier\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"airdrop_identifier\"R\x11\x61irdropIdentifier\x12,\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12W\n\x06weight\x18\x03 \x01(\tB?\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\ryaml:\"weight\"R\x06weight\x12\x46\n\x10\x61\x63tion_completed\x18\x04 \x03(\x08\x42\x1b\xf2\xde\x1f\x17yaml:\"action_completed\"R\x0f\x61\x63tionCompleted*S\n\x06\x41\x63tion\x12\x0f\n\x0b\x41\x43TION_FREE\x10\x00\x12\x17\n\x13\x41\x43TION_LIQUID_STAKE\x10\x01\x12\x19\n\x15\x41\x43TION_DELEGATE_STAKE\x10\x02\x1a\x04\x88\xa3\x1e\x00\x42\x9f\x01\n\x10\x63om.stride.claimB\nClaimProtoP\x01Z.github.com/Stride-Labs/stride/v9/x/claim/types\xa2\x02\x03SCX\xaa\x02\x0cStride.Claim\xca\x02\x0cStride\\Claim\xe2\x02\x18Stride\\Claim\\GPBMetadata\xea\x02\rStride::Claimb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.claim.claim_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.stride.claimB\nClaimProtoP\001Z.github.com/Stride-Labs/stride/v9/x/claim/types\242\002\003SCX\252\002\014Stride.Claim\312\002\014Stride\\Claim\342\002\030Stride\\Claim\\GPBMetadata\352\002\rStride::Claim'
  _ACTION._options = None
  _ACTION._serialized_options = b'\210\243\036\000'
  _CLAIMRECORD.fields_by_name['airdrop_identifier']._options = None
  _CLAIMRECORD.fields_by_name['airdrop_identifier']._serialized_options = b'\362\336\037\031yaml:\"airdrop_identifier\"'
  _CLAIMRECORD.fields_by_name['address']._options = None
  _CLAIMRECORD.fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _CLAIMRECORD.fields_by_name['weight']._options = None
  _CLAIMRECORD.fields_by_name['weight']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\ryaml:\"weight\"'
  _CLAIMRECORD.fields_by_name['action_completed']._options = None
  _CLAIMRECORD.fields_by_name['action_completed']._serialized_options = b'\362\336\037\027yaml:\"action_completed\"'
  _globals['_ACTION']._serialized_start=365
  _globals['_ACTION']._serialized_end=448
  _globals['_CLAIMRECORD']._serialized_start=65
  _globals['_CLAIMRECORD']._serialized_end=363
# @@protoc_insertion_point(module_scope)