# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/marker/v1/marker.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.auth.v1beta1 import auth_pb2 as cosmos_dot_auth_dot_v1beta1_dot_auth__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from provenance.marker.v1 import accessgrant_pb2 as provenance_dot_marker_dot_v1_dot_accessgrant__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!provenance/marker/v1/marker.proto\x12\x14provenance.marker.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/auth/v1beta1/auth.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a&provenance/marker/v1/accessgrant.proto\"\xb3\x01\n\x06Params\x12\x38\n\x10max_total_supply\x18\x01 \x01(\x04\x42\x0e\xc8\xde\x1f\x00\xda\xde\x1f\x06uint64R\x0emaxTotalSupply\x12+\n\x11\x65nable_governance\x18\x02 \x01(\x08R\x10\x65nableGovernance\x12\x38\n\x18unrestricted_denom_regex\x18\x03 \x01(\tR\x16unrestrictedDenomRegex:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x81\x06\n\rMarkerAccount\x12`\n\x0c\x62\x61se_account\x18\x01 \x01(\x0b\x32 .cosmos.auth.v1beta1.BaseAccountB\x1b\xd0\xde\x1f\x01\xf2\xde\x1f\x13yaml:\"base_account\"R\x0b\x62\x61seAccount\x12\x36\n\x07manager\x18\x02 \x01(\tB\x1c\xf2\xde\x1f\x18json:\"manager,omitempty\"R\x07manager\x12N\n\x0e\x61\x63\x63\x65ss_control\x18\x03 \x03(\x0b\x32!.provenance.marker.v1.AccessGrantB\x04\xc8\xde\x1f\x00R\raccessControl\x12:\n\x06status\x18\x04 \x01(\x0e\x32\".provenance.marker.v1.MarkerStatusR\x06status\x12\x14\n\x05\x64\x65nom\x18\x05 \x01(\tR\x05\x64\x65nom\x12q\n\x06supply\x18\x06 \x01(\tBY\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\'json:\"total_supply\" yaml:\"total_supply\"R\x06supply\x12\x63\n\x0bmarker_type\x18\x07 \x01(\x0e\x32 .provenance.marker.v1.MarkerTypeB \xf2\xde\x1f\x1cjson:\"marker_type,omitempty\"R\nmarkerType\x12!\n\x0csupply_fixed\x18\x08 \x01(\x08R\x0bsupplyFixed\x12\x38\n\x18\x61llow_governance_control\x18\t \x01(\x08R\x16\x61llowGovernanceControl\x12\x32\n\x15\x61llow_forced_transfer\x18\n \x01(\x08R\x13\x61llowForcedTransfer\x12/\n\x13required_attributes\x18\x0b \x03(\tR\x12requiredAttributes:\x1a\x88\xa0\x1f\x00\x98\xa0\x1f\x00\xca\xb4-\x0eMarkerAccountI\"\xab\x01\n\x0e\x45ventMarkerAdd\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x16\n\x06\x61mount\x18\x02 \x01(\tR\x06\x61mount\x12\x16\n\x06status\x18\x03 \x01(\tR\x06status\x12\x18\n\x07manager\x18\x04 \x01(\tR\x07manager\x12\x1f\n\x0bmarker_type\x18\x05 \x01(\tR\nmarkerType\x12\x18\n\x07\x61\x64\x64ress\x18\x06 \x01(\tR\x07\x61\x64\x64ress\"\x99\x01\n\x14\x45ventMarkerAddAccess\x12\x45\n\x06\x61\x63\x63\x65ss\x18\x01 \x01(\x0b\x32\'.provenance.marker.v1.EventMarkerAccessB\x04\xc8\xde\x1f\x00R\x06\x61\x63\x63\x65ss\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\"O\n\x11\x45ventMarkerAccess\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12 \n\x0bpermissions\x18\x02 \x03(\tR\x0bpermissions\"|\n\x17\x45ventMarkerDeleteAccess\x12%\n\x0eremove_address\x18\x01 \x01(\tR\rremoveAddress\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\"Q\n\x13\x45ventMarkerFinalize\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"Q\n\x13\x45ventMarkerActivate\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"O\n\x11\x45ventMarkerCancel\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"O\n\x11\x45ventMarkerDelete\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x02 \x01(\tR\radministrator\"e\n\x0f\x45ventMarkerMint\x12\x16\n\x06\x61mount\x18\x01 \x01(\tR\x06\x61mount\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\"e\n\x0f\x45ventMarkerBurn\x12\x16\n\x06\x61mount\x18\x01 \x01(\tR\x06\x61mount\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\"\x86\x01\n\x13\x45ventMarkerWithdraw\x12\x14\n\x05\x63oins\x18\x01 \x01(\tR\x05\x63oins\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\x12\x1d\n\nto_address\x18\x04 \x01(\tR\ttoAddress\"\xab\x01\n\x13\x45ventMarkerTransfer\x12\x16\n\x06\x61mount\x18\x01 \x01(\tR\x06\x61mount\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12$\n\radministrator\x18\x03 \x01(\tR\radministrator\x12\x1d\n\nto_address\x18\x04 \x01(\tR\ttoAddress\x12!\n\x0c\x66rom_address\x18\x05 \x01(\tR\x0b\x66romAddress\"\xec\x02\n\x1b\x45ventMarkerSetDenomMetadata\x12#\n\rmetadata_base\x18\x01 \x01(\tR\x0cmetadataBase\x12\x31\n\x14metadata_description\x18\x02 \x01(\tR\x13metadataDescription\x12)\n\x10metadata_display\x18\x03 \x01(\tR\x0fmetadataDisplay\x12V\n\x14metadata_denom_units\x18\x04 \x03(\x0b\x32$.provenance.marker.v1.EventDenomUnitR\x12metadataDenomUnits\x12$\n\radministrator\x18\x05 \x01(\tR\radministrator\x12#\n\rmetadata_name\x18\x06 \x01(\tR\x0cmetadataName\x12\'\n\x0fmetadata_symbol\x18\x07 \x01(\tR\x0emetadataSymbol\"\\\n\x0e\x45ventDenomUnit\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x1a\n\x08\x65xponent\x18\x02 \x01(\tR\x08\x65xponent\x12\x18\n\x07\x61liases\x18\x03 \x03(\tR\x07\x61liases*\x86\x01\n\nMarkerType\x12(\n\x17MARKER_TYPE_UNSPECIFIED\x10\x00\x1a\x0b\x8a\x9d \x07Unknown\x12\x1e\n\x10MARKER_TYPE_COIN\x10\x01\x1a\x08\x8a\x9d \x04\x43oin\x12.\n\x16MARKER_TYPE_RESTRICTED\x10\x02\x1a\x12\x8a\x9d \x0eRestrictedCoin*\xbe\x02\n\x0cMarkerStatus\x12\x32\n\x19MARKER_STATUS_UNSPECIFIED\x10\x00\x1a\x13\x8a\x9d \x0fStatusUndefined\x12.\n\x16MARKER_STATUS_PROPOSED\x10\x01\x1a\x12\x8a\x9d \x0eStatusProposed\x12\x30\n\x17MARKER_STATUS_FINALIZED\x10\x02\x1a\x13\x8a\x9d \x0fStatusFinalized\x12*\n\x14MARKER_STATUS_ACTIVE\x10\x03\x1a\x10\x8a\x9d \x0cStatusActive\x12\x30\n\x17MARKER_STATUS_CANCELLED\x10\x04\x1a\x13\x8a\x9d \x0fStatusCancelled\x12\x30\n\x17MARKER_STATUS_DESTROYED\x10\x05\x1a\x13\x8a\x9d \x0fStatusDestroyed\x1a\x08\x88\xa3\x1e\x00\xa8\xa4\x1e\x00\x42\xcd\x01\n\x18\x63om.provenance.marker.v1B\x0bMarkerProtoP\x01Z2github.com/provenance-io/provenance/x/marker/types\xa2\x02\x03PMX\xaa\x02\x14Provenance.Marker.V1\xca\x02\x14Provenance\\Marker\\V1\xe2\x02 Provenance\\Marker\\V1\\GPBMetadata\xea\x02\x16Provenance::Marker::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.marker.v1.marker_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.provenance.marker.v1B\013MarkerProtoP\001Z2github.com/provenance-io/provenance/x/marker/types\242\002\003PMX\252\002\024Provenance.Marker.V1\312\002\024Provenance\\Marker\\V1\342\002 Provenance\\Marker\\V1\\GPBMetadata\352\002\026Provenance::Marker::V1'
  _MARKERTYPE.values_by_name["MARKER_TYPE_UNSPECIFIED"]._options = None
  _MARKERTYPE.values_by_name["MARKER_TYPE_UNSPECIFIED"]._serialized_options = b'\212\235 \007Unknown'
  _MARKERTYPE.values_by_name["MARKER_TYPE_COIN"]._options = None
  _MARKERTYPE.values_by_name["MARKER_TYPE_COIN"]._serialized_options = b'\212\235 \004Coin'
  _MARKERTYPE.values_by_name["MARKER_TYPE_RESTRICTED"]._options = None
  _MARKERTYPE.values_by_name["MARKER_TYPE_RESTRICTED"]._serialized_options = b'\212\235 \016RestrictedCoin'
  _MARKERSTATUS._options = None
  _MARKERSTATUS._serialized_options = b'\210\243\036\000\250\244\036\000'
  _MARKERSTATUS.values_by_name["MARKER_STATUS_UNSPECIFIED"]._options = None
  _MARKERSTATUS.values_by_name["MARKER_STATUS_UNSPECIFIED"]._serialized_options = b'\212\235 \017StatusUndefined'
  _MARKERSTATUS.values_by_name["MARKER_STATUS_PROPOSED"]._options = None
  _MARKERSTATUS.values_by_name["MARKER_STATUS_PROPOSED"]._serialized_options = b'\212\235 \016StatusProposed'
  _MARKERSTATUS.values_by_name["MARKER_STATUS_FINALIZED"]._options = None
  _MARKERSTATUS.values_by_name["MARKER_STATUS_FINALIZED"]._serialized_options = b'\212\235 \017StatusFinalized'
  _MARKERSTATUS.values_by_name["MARKER_STATUS_ACTIVE"]._options = None
  _MARKERSTATUS.values_by_name["MARKER_STATUS_ACTIVE"]._serialized_options = b'\212\235 \014StatusActive'
  _MARKERSTATUS.values_by_name["MARKER_STATUS_CANCELLED"]._options = None
  _MARKERSTATUS.values_by_name["MARKER_STATUS_CANCELLED"]._serialized_options = b'\212\235 \017StatusCancelled'
  _MARKERSTATUS.values_by_name["MARKER_STATUS_DESTROYED"]._options = None
  _MARKERSTATUS.values_by_name["MARKER_STATUS_DESTROYED"]._serialized_options = b'\212\235 \017StatusDestroyed'
  _PARAMS.fields_by_name['max_total_supply']._options = None
  _PARAMS.fields_by_name['max_total_supply']._serialized_options = b'\310\336\037\000\332\336\037\006uint64'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000\350\240\037\000'
  _MARKERACCOUNT.fields_by_name['base_account']._options = None
  _MARKERACCOUNT.fields_by_name['base_account']._serialized_options = b'\320\336\037\001\362\336\037\023yaml:\"base_account\"'
  _MARKERACCOUNT.fields_by_name['manager']._options = None
  _MARKERACCOUNT.fields_by_name['manager']._serialized_options = b'\362\336\037\030json:\"manager,omitempty\"'
  _MARKERACCOUNT.fields_by_name['access_control']._options = None
  _MARKERACCOUNT.fields_by_name['access_control']._serialized_options = b'\310\336\037\000'
  _MARKERACCOUNT.fields_by_name['supply']._options = None
  _MARKERACCOUNT.fields_by_name['supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\'json:\"total_supply\" yaml:\"total_supply\"'
  _MARKERACCOUNT.fields_by_name['marker_type']._options = None
  _MARKERACCOUNT.fields_by_name['marker_type']._serialized_options = b'\362\336\037\034json:\"marker_type,omitempty\"'
  _MARKERACCOUNT._options = None
  _MARKERACCOUNT._serialized_options = b'\210\240\037\000\230\240\037\000\312\264-\016MarkerAccountI'
  _EVENTMARKERADDACCESS.fields_by_name['access']._options = None
  _EVENTMARKERADDACCESS.fields_by_name['access']._serialized_options = b'\310\336\037\000'
  _globals['_MARKERTYPE']._serialized_start=2978
  _globals['_MARKERTYPE']._serialized_end=3112
  _globals['_MARKERSTATUS']._serialized_start=3115
  _globals['_MARKERSTATUS']._serialized_end=3433
  _globals['_PARAMS']._serialized_start=181
  _globals['_PARAMS']._serialized_end=360
  _globals['_MARKERACCOUNT']._serialized_start=363
  _globals['_MARKERACCOUNT']._serialized_end=1132
  _globals['_EVENTMARKERADD']._serialized_start=1135
  _globals['_EVENTMARKERADD']._serialized_end=1306
  _globals['_EVENTMARKERADDACCESS']._serialized_start=1309
  _globals['_EVENTMARKERADDACCESS']._serialized_end=1462
  _globals['_EVENTMARKERACCESS']._serialized_start=1464
  _globals['_EVENTMARKERACCESS']._serialized_end=1543
  _globals['_EVENTMARKERDELETEACCESS']._serialized_start=1545
  _globals['_EVENTMARKERDELETEACCESS']._serialized_end=1669
  _globals['_EVENTMARKERFINALIZE']._serialized_start=1671
  _globals['_EVENTMARKERFINALIZE']._serialized_end=1752
  _globals['_EVENTMARKERACTIVATE']._serialized_start=1754
  _globals['_EVENTMARKERACTIVATE']._serialized_end=1835
  _globals['_EVENTMARKERCANCEL']._serialized_start=1837
  _globals['_EVENTMARKERCANCEL']._serialized_end=1916
  _globals['_EVENTMARKERDELETE']._serialized_start=1918
  _globals['_EVENTMARKERDELETE']._serialized_end=1997
  _globals['_EVENTMARKERMINT']._serialized_start=1999
  _globals['_EVENTMARKERMINT']._serialized_end=2100
  _globals['_EVENTMARKERBURN']._serialized_start=2102
  _globals['_EVENTMARKERBURN']._serialized_end=2203
  _globals['_EVENTMARKERWITHDRAW']._serialized_start=2206
  _globals['_EVENTMARKERWITHDRAW']._serialized_end=2340
  _globals['_EVENTMARKERTRANSFER']._serialized_start=2343
  _globals['_EVENTMARKERTRANSFER']._serialized_end=2514
  _globals['_EVENTMARKERSETDENOMMETADATA']._serialized_start=2517
  _globals['_EVENTMARKERSETDENOMMETADATA']._serialized_end=2881
  _globals['_EVENTDENOMUNIT']._serialized_start=2883
  _globals['_EVENTDENOMUNIT']._serialized_end=2975
# @@protoc_insertion_point(module_scope)
