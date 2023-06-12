# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/marker/v1/proposals.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.bank.v1beta1 import bank_pb2 as cosmos_dot_bank_dot_v1beta1_dot_bank__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from provenance.marker.v1 import marker_pb2 as provenance_dot_marker_dot_v1_dot_marker__pb2
from provenance.marker.v1 import accessgrant_pb2 as provenance_dot_marker_dot_v1_dot_accessgrant__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$provenance/marker/v1/proposals.proto\x12\x14provenance.marker.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/bank/v1beta1/bank.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a!provenance/marker/v1/marker.proto\x1a&provenance/marker/v1/accessgrant.proto\"\xf7\x03\n\x11\x41\x64\x64MarkerProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x62\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12\x18\n\x07manager\x18\x04 \x01(\tR\x07manager\x12:\n\x06status\x18\x05 \x01(\x0e\x32\".provenance.marker.v1.MarkerStatusR\x06status\x12\x41\n\x0bmarker_type\x18\x06 \x01(\x0e\x32 .provenance.marker.v1.MarkerTypeR\nmarkerType\x12H\n\x0b\x61\x63\x63\x65ss_list\x18\x07 \x03(\x0b\x32!.provenance.marker.v1.AccessGrantB\x04\xc8\xde\x1f\x00R\naccessList\x12!\n\x0csupply_fixed\x18\x08 \x01(\x08R\x0bsupplyFixed\x12\x38\n\x18\x61llow_governance_control\x18\t \x01(\x08R\x16\x61llowGovernanceControl:\x06\x18\x01\xe8\xa0\x1f\x01\"\xe5\x01\n\x16SupplyIncreaseProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x62\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount\x12%\n\x0etarget_address\x18\x04 \x01(\tR\rtargetAddress:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xbe\x01\n\x16SupplyDecreaseProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x62\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61mount:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xb3\x01\n\x18SetAdministratorProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12?\n\x06\x61\x63\x63\x65ss\x18\x04 \x03(\x0b\x32!.provenance.marker.v1.AccessGrantB\x04\xc8\xde\x1f\x00R\x06\x61\x63\x63\x65ss:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\x9e\x01\n\x1bRemoveAdministratorProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\'\n\x0fremoved_address\x18\x04 \x03(\tR\x0eremovedAddress:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xb1\x01\n\x14\x43hangeStatusProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x41\n\nnew_status\x18\x04 \x01(\x0e\x32\".provenance.marker.v1.MarkerStatusR\tnewStatus:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xfc\x01\n\x16WithdrawEscrowProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x63\n\x06\x61mount\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12%\n\x0etarget_address\x18\x05 \x01(\tR\rtargetAddress:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xcf\x01\n\x18SetDenomMetadataProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12u\n\x08metadata\x18\x03 \x01(\x0b\x32\x1d.cosmos.bank.v1beta1.MetadataB:\xc8\xde\x1f\x00\xda\xde\x1f\x32github.com/cosmos/cosmos-sdk/x/bank/types.MetadataR\x08metadata:\x04\x98\xa0\x1f\x00\x42\xd0\x01\n\x18\x63om.provenance.marker.v1B\x0eProposalsProtoP\x01Z2github.com/provenance-io/provenance/x/marker/types\xa2\x02\x03PMX\xaa\x02\x14Provenance.Marker.V1\xca\x02\x14Provenance\\Marker\\V1\xe2\x02 Provenance\\Marker\\V1\\GPBMetadata\xea\x02\x16Provenance::Marker::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.marker.v1.proposals_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.provenance.marker.v1B\016ProposalsProtoP\001Z2github.com/provenance-io/provenance/x/marker/types\242\002\003PMX\252\002\024Provenance.Marker.V1\312\002\024Provenance\\Marker\\V1\342\002 Provenance\\Marker\\V1\\GPBMetadata\352\002\026Provenance::Marker::V1'
  _ADDMARKERPROPOSAL.fields_by_name['amount']._options = None
  _ADDMARKERPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _ADDMARKERPROPOSAL.fields_by_name['access_list']._options = None
  _ADDMARKERPROPOSAL.fields_by_name['access_list']._serialized_options = b'\310\336\037\000'
  _ADDMARKERPROPOSAL._options = None
  _ADDMARKERPROPOSAL._serialized_options = b'\030\001\350\240\037\001'
  _SUPPLYINCREASEPROPOSAL.fields_by_name['amount']._options = None
  _SUPPLYINCREASEPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _SUPPLYINCREASEPROPOSAL._options = None
  _SUPPLYINCREASEPROPOSAL._serialized_options = b'\230\240\037\000\350\240\037\001'
  _SUPPLYDECREASEPROPOSAL.fields_by_name['amount']._options = None
  _SUPPLYDECREASEPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _SUPPLYDECREASEPROPOSAL._options = None
  _SUPPLYDECREASEPROPOSAL._serialized_options = b'\230\240\037\000\350\240\037\001'
  _SETADMINISTRATORPROPOSAL.fields_by_name['access']._options = None
  _SETADMINISTRATORPROPOSAL.fields_by_name['access']._serialized_options = b'\310\336\037\000'
  _SETADMINISTRATORPROPOSAL._options = None
  _SETADMINISTRATORPROPOSAL._serialized_options = b'\230\240\037\000\350\240\037\001'
  _REMOVEADMINISTRATORPROPOSAL._options = None
  _REMOVEADMINISTRATORPROPOSAL._serialized_options = b'\230\240\037\000\350\240\037\001'
  _CHANGESTATUSPROPOSAL._options = None
  _CHANGESTATUSPROPOSAL._serialized_options = b'\230\240\037\000\350\240\037\001'
  _WITHDRAWESCROWPROPOSAL.fields_by_name['amount']._options = None
  _WITHDRAWESCROWPROPOSAL.fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _WITHDRAWESCROWPROPOSAL._options = None
  _WITHDRAWESCROWPROPOSAL._serialized_options = b'\230\240\037\000\350\240\037\001'
  _SETDENOMMETADATAPROPOSAL.fields_by_name['metadata']._options = None
  _SETDENOMMETADATAPROPOSAL.fields_by_name['metadata']._serialized_options = b'\310\336\037\000\332\336\0372github.com/cosmos/cosmos-sdk/x/bank/types.Metadata'
  _SETDENOMMETADATAPROPOSAL._options = None
  _SETDENOMMETADATAPROPOSAL._serialized_options = b'\230\240\037\000'
  _globals['_ADDMARKERPROPOSAL']._serialized_start=224
  _globals['_ADDMARKERPROPOSAL']._serialized_end=727
  _globals['_SUPPLYINCREASEPROPOSAL']._serialized_start=730
  _globals['_SUPPLYINCREASEPROPOSAL']._serialized_end=959
  _globals['_SUPPLYDECREASEPROPOSAL']._serialized_start=962
  _globals['_SUPPLYDECREASEPROPOSAL']._serialized_end=1152
  _globals['_SETADMINISTRATORPROPOSAL']._serialized_start=1155
  _globals['_SETADMINISTRATORPROPOSAL']._serialized_end=1334
  _globals['_REMOVEADMINISTRATORPROPOSAL']._serialized_start=1337
  _globals['_REMOVEADMINISTRATORPROPOSAL']._serialized_end=1495
  _globals['_CHANGESTATUSPROPOSAL']._serialized_start=1498
  _globals['_CHANGESTATUSPROPOSAL']._serialized_end=1675
  _globals['_WITHDRAWESCROWPROPOSAL']._serialized_start=1678
  _globals['_WITHDRAWESCROWPROPOSAL']._serialized_end=1930
  _globals['_SETDENOMMETADATAPROPOSAL']._serialized_start=1933
  _globals['_SETDENOMMETADATAPROPOSAL']._serialized_end=2140
# @@protoc_insertion_point(module_scope)
