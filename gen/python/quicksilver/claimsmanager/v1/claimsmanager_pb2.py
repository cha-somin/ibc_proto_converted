# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/claimsmanager/v1/claimsmanager.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from tendermint.crypto import proof_pb2 as tendermint_dot_crypto_dot_proof__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n0quicksilver/claimsmanager/v1/claimsmanager.proto\x12\x1cquicksilver.claimsmanager.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1dtendermint/crypto/proof.proto\"\x12\n\x06Params:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"\xe6\x01\n\x05\x43laim\x12;\n\x0cuser_address\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x0buserAddress\x12\x19\n\x08\x63hain_id\x18\x02 \x01(\tR\x07\x63hainId\x12?\n\x06module\x18\x03 \x01(\x0e\x32\'.quicksilver.claimsmanager.v1.ClaimTypeR\x06module\x12&\n\x0fsource_chain_id\x18\x04 \x01(\tR\rsourceChainId\x12\x16\n\x06\x61mount\x18\x05 \x01(\x04R\x06\x61mount:\x04\x88\xa0\x1f\x00\"\xaa\x01\n\x05Proof\x12\x10\n\x03key\x18\x01 \x01(\x0cR\x03key\x12\x12\n\x04\x64\x61ta\x18\x02 \x01(\x0cR\x04\x64\x61ta\x12\x39\n\tproof_ops\x18\x03 \x01(\x0b\x32\x1b.tendermint.crypto.ProofOpsR\tproof_ops\x12\x16\n\x06height\x18\x04 \x01(\x03R\x06height\x12\x1e\n\nproof_type\x18\x05 \x01(\tR\nproof_type:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00*\x93\x01\n\tClaimType\x12\x16\n\x12\x43laimTypeUndefined\x10\x00\x12\x18\n\x14\x43laimTypeLiquidToken\x10\x01\x12\x18\n\x14\x43laimTypeOsmosisPool\x10\x02\x12\x19\n\x15\x43laimTypeCrescentPool\x10\x03\x12\x19\n\x15\x43laimTypeSifchainPool\x10\x04\x1a\x04\x88\xa3\x1e\x00\x42\x86\x02\n com.quicksilver.claimsmanager.v1B\x12\x43laimsmanagerProtoP\x01Z<github.com/ingenuity-build/quicksilver/x/claimsmanager/types\xa2\x02\x03QCX\xaa\x02\x1cQuicksilver.Claimsmanager.V1\xca\x02\x1cQuicksilver\\Claimsmanager\\V1\xe2\x02(Quicksilver\\Claimsmanager\\V1\\GPBMetadata\xea\x02\x1eQuicksilver::Claimsmanager::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.claimsmanager.v1.claimsmanager_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.quicksilver.claimsmanager.v1B\022ClaimsmanagerProtoP\001Z<github.com/ingenuity-build/quicksilver/x/claimsmanager/types\242\002\003QCX\252\002\034Quicksilver.Claimsmanager.V1\312\002\034Quicksilver\\Claimsmanager\\V1\342\002(Quicksilver\\Claimsmanager\\V1\\GPBMetadata\352\002\036Quicksilver::Claimsmanager::V1'
  _CLAIMTYPE._options = None
  _CLAIMTYPE._serialized_options = b'\210\243\036\000'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\210\240\037\000\230\240\037\000'
  _CLAIM.fields_by_name['user_address']._options = None
  _CLAIM.fields_by_name['user_address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _CLAIM._options = None
  _CLAIM._serialized_options = b'\210\240\037\000'
  _PROOF._options = None
  _PROOF._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_CLAIMTYPE']._serialized_start=589
  _globals['_CLAIMTYPE']._serialized_end=736
  _globals['_PARAMS']._serialized_start=162
  _globals['_PARAMS']._serialized_end=180
  _globals['_CLAIM']._serialized_start=183
  _globals['_CLAIM']._serialized_end=413
  _globals['_PROOF']._serialized_start=416
  _globals['_PROOF']._serialized_end=586
# @@protoc_insertion_point(module_scope)
