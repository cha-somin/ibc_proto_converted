# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: teritori/airdrop/v1beta1/allocation.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)teritori/airdrop/v1beta1/allocation.proto\x12\x18teritori.airdrop.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xe4\x01\n\x11\x41irdropAllocation\x12\x14\n\x05\x63hain\x18\x01 \x01(\tR\x05\x63hain\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12G\n\x06\x61mount\x18\x03 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12V\n\x0e\x63laimed_amount\x18\x04 \x01(\tB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\rclaimedAmountB\xe5\x01\n\x1c\x63om.teritori.airdrop.v1beta1B\x0f\x41llocationProtoP\x01Z2github.com/TERITORI/teritori-chain/x/airdrop/types\xa2\x02\x03TAX\xaa\x02\x18Teritori.Airdrop.V1beta1\xca\x02\x18Teritori\\Airdrop\\V1beta1\xe2\x02$Teritori\\Airdrop\\V1beta1\\GPBMetadata\xea\x02\x1aTeritori::Airdrop::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'teritori.airdrop.v1beta1.allocation_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.teritori.airdrop.v1beta1B\017AllocationProtoP\001Z2github.com/TERITORI/teritori-chain/x/airdrop/types\242\002\003TAX\252\002\030Teritori.Airdrop.V1beta1\312\002\030Teritori\\Airdrop\\V1beta1\342\002$Teritori\\Airdrop\\V1beta1\\GPBMetadata\352\002\032Teritori::Airdrop::V1beta1'
  _AIRDROPALLOCATION.fields_by_name['amount']._options = None
  _AIRDROPALLOCATION.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _AIRDROPALLOCATION.fields_by_name['claimed_amount']._options = None
  _AIRDROPALLOCATION.fields_by_name['claimed_amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_AIRDROPALLOCATION']._serialized_start=121
  _globals['_AIRDROPALLOCATION']._serialized_end=349
# @@protoc_insertion_point(module_scope)
