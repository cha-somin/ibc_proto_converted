# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/profiles/v1beta1/models_app_links.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.desmos/profiles/v1beta1/models_app_links.proto\x12\x17\x64\x65smos.profiles.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xfc\x03\n\x0f\x41pplicationLink\x12#\n\x04user\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\x12\x46\n\x04\x64\x61ta\x18\x02 \x01(\x0b\x32\x1d.desmos.profiles.v1beta1.DataB\x13\xc8\xde\x1f\x00\xf2\xde\x1f\x0byaml:\"data\"R\x04\x64\x61ta\x12U\n\x05state\x18\x03 \x01(\x0e\x32-.desmos.profiles.v1beta1.ApplicationLinkStateB\x10\xf2\xde\x1f\x0cyaml:\"state\"R\x05state\x12l\n\x0eoracle_request\x18\x04 \x01(\x0b\x32&.desmos.profiles.v1beta1.OracleRequestB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x15yaml:\"oracle_request\"R\roracleRequest\x12J\n\x06result\x18\x05 \x01(\x0b\x32\x1f.desmos.profiles.v1beta1.ResultB\x11\xf2\xde\x1f\ryaml:\"result\"R\x06result\x12\x61\n\rcreation_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB \xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"creation_time\"\x90\xdf\x1f\x01R\x0c\x63reationTime:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\"{\n\x04\x44\x61ta\x12\x38\n\x0b\x61pplication\x18\x01 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"application\"R\x0b\x61pplication\x12/\n\x08username\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"username\"R\x08username:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xbd\x03\n\rOracleRequest\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12W\n\x10oracle_script_id\x18\x02 \x01(\x04\x42-\xe2\xde\x1f\x0eOracleScriptID\xf2\xde\x1f\x17yaml:\"oracle_script_id\"R\x0eoracleScriptId\x12\x66\n\tcall_data\x18\x03 \x01(\x0b\x32/.desmos.profiles.v1beta1.OracleRequest.CallDataB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"call_data\"R\x08\x63\x61llData\x12=\n\tclient_id\x18\x04 \x01(\tB \xe2\xde\x1f\x08\x43lientID\xf2\xde\x1f\x10yaml:\"client_id\"R\x08\x63lientId\x1a}\n\x08\x43\x61llData\x12\x38\n\x0b\x61pplication\x18\x01 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"application\"R\x0b\x61pplication\x12\x31\n\tcall_data\x18\x02 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"call_data\"R\x08\x63\x61llData:\x04\xe8\xa0\x1f\x01:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xcd\x02\n\x06Result\x12\x43\n\x07success\x18\x01 \x01(\x0b\x32\'.desmos.profiles.v1beta1.Result.SuccessH\x00R\x07success\x12@\n\x06\x66\x61iled\x18\x02 \x01(\x0b\x32&.desmos.profiles.v1beta1.Result.FailedH\x00R\x06\x66\x61iled\x1ao\n\x07Success\x12&\n\x05value\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"value\"R\x05value\x12\x32\n\tsignature\x18\x02 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"signature\"R\tsignature:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\x1a:\n\x06\x46\x61iled\x12&\n\x05\x65rror\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"error\"R\x05\x65rror:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\x42\x05\n\x03sum*\xbf\x03\n\x14\x41pplicationLinkState\x12W\n.APPLICATION_LINK_STATE_INITIALIZED_UNSPECIFIED\x10\x00\x1a#\x8a\x9d \x1f\x41pplicationLinkStateInitialized\x12T\n+APPLICATION_LINK_STATE_VERIFICATION_STARTED\x10\x01\x1a#\x8a\x9d \x1f\x41ppLinkStateVerificationStarted\x12P\n)APPLICATION_LINK_STATE_VERIFICATION_ERROR\x10\x02\x1a!\x8a\x9d \x1d\x41ppLinkStateVerificationError\x12T\n+APPLICATION_LINK_STATE_VERIFICATION_SUCCESS\x10\x03\x1a#\x8a\x9d \x1f\x41ppLinkStateVerificationSuccess\x12J\n APPLICATION_LINK_STATE_TIMED_OUT\x10\x04\x1a$\x8a\x9d  AppLinkStateVerificationTimedOut\x1a\x04\x88\xa3\x1e\x00\x42\xed\x01\n\x1b\x63om.desmos.profiles.v1beta1B\x13ModelsAppLinksProtoP\x01Z;github.com/desmos-labs/desmos/v5/x/profiles/legacy/v4/types\xa2\x02\x03\x44PX\xaa\x02\x17\x44\x65smos.Profiles.V1beta1\xca\x02\x17\x44\x65smos\\Profiles\\V1beta1\xe2\x02#Desmos\\Profiles\\V1beta1\\GPBMetadata\xea\x02\x19\x44\x65smos::Profiles::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.profiles.v1beta1.models_app_links_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.desmos.profiles.v1beta1B\023ModelsAppLinksProtoP\001Z;github.com/desmos-labs/desmos/v5/x/profiles/legacy/v4/types\242\002\003DPX\252\002\027Desmos.Profiles.V1beta1\312\002\027Desmos\\Profiles\\V1beta1\342\002#Desmos\\Profiles\\V1beta1\\GPBMetadata\352\002\031Desmos::Profiles::V1beta1'
  _APPLICATIONLINKSTATE._options = None
  _APPLICATIONLINKSTATE._serialized_options = b'\210\243\036\000'
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_INITIALIZED_UNSPECIFIED"]._options = None
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_INITIALIZED_UNSPECIFIED"]._serialized_options = b'\212\235 \037ApplicationLinkStateInitialized'
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_VERIFICATION_STARTED"]._options = None
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_VERIFICATION_STARTED"]._serialized_options = b'\212\235 \037AppLinkStateVerificationStarted'
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_VERIFICATION_ERROR"]._options = None
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_VERIFICATION_ERROR"]._serialized_options = b'\212\235 \035AppLinkStateVerificationError'
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_VERIFICATION_SUCCESS"]._options = None
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_VERIFICATION_SUCCESS"]._serialized_options = b'\212\235 \037AppLinkStateVerificationSuccess'
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_TIMED_OUT"]._options = None
  _APPLICATIONLINKSTATE.values_by_name["APPLICATION_LINK_STATE_TIMED_OUT"]._serialized_options = b'\212\235  AppLinkStateVerificationTimedOut'
  _APPLICATIONLINK.fields_by_name['user']._options = None
  _APPLICATIONLINK.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _APPLICATIONLINK.fields_by_name['data']._options = None
  _APPLICATIONLINK.fields_by_name['data']._serialized_options = b'\310\336\037\000\362\336\037\013yaml:\"data\"'
  _APPLICATIONLINK.fields_by_name['state']._options = None
  _APPLICATIONLINK.fields_by_name['state']._serialized_options = b'\362\336\037\014yaml:\"state\"'
  _APPLICATIONLINK.fields_by_name['oracle_request']._options = None
  _APPLICATIONLINK.fields_by_name['oracle_request']._serialized_options = b'\310\336\037\000\362\336\037\025yaml:\"oracle_request\"'
  _APPLICATIONLINK.fields_by_name['result']._options = None
  _APPLICATIONLINK.fields_by_name['result']._serialized_options = b'\362\336\037\ryaml:\"result\"'
  _APPLICATIONLINK.fields_by_name['creation_time']._options = None
  _APPLICATIONLINK.fields_by_name['creation_time']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"creation_time\"\220\337\037\001'
  _APPLICATIONLINK._options = None
  _APPLICATIONLINK._serialized_options = b'\210\240\037\000\350\240\037\001'
  _DATA.fields_by_name['application']._options = None
  _DATA.fields_by_name['application']._serialized_options = b'\362\336\037\022yaml:\"application\"'
  _DATA.fields_by_name['username']._options = None
  _DATA.fields_by_name['username']._serialized_options = b'\362\336\037\017yaml:\"username\"'
  _DATA._options = None
  _DATA._serialized_options = b'\210\240\037\000\350\240\037\001'
  _ORACLEREQUEST_CALLDATA.fields_by_name['application']._options = None
  _ORACLEREQUEST_CALLDATA.fields_by_name['application']._serialized_options = b'\362\336\037\022yaml:\"application\"'
  _ORACLEREQUEST_CALLDATA.fields_by_name['call_data']._options = None
  _ORACLEREQUEST_CALLDATA.fields_by_name['call_data']._serialized_options = b'\362\336\037\020yaml:\"call_data\"'
  _ORACLEREQUEST_CALLDATA._options = None
  _ORACLEREQUEST_CALLDATA._serialized_options = b'\350\240\037\001'
  _ORACLEREQUEST.fields_by_name['id']._options = None
  _ORACLEREQUEST.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _ORACLEREQUEST.fields_by_name['oracle_script_id']._options = None
  _ORACLEREQUEST.fields_by_name['oracle_script_id']._serialized_options = b'\342\336\037\016OracleScriptID\362\336\037\027yaml:\"oracle_script_id\"'
  _ORACLEREQUEST.fields_by_name['call_data']._options = None
  _ORACLEREQUEST.fields_by_name['call_data']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"call_data\"'
  _ORACLEREQUEST.fields_by_name['client_id']._options = None
  _ORACLEREQUEST.fields_by_name['client_id']._serialized_options = b'\342\336\037\010ClientID\362\336\037\020yaml:\"client_id\"'
  _ORACLEREQUEST._options = None
  _ORACLEREQUEST._serialized_options = b'\210\240\037\000\350\240\037\001'
  _RESULT_SUCCESS.fields_by_name['value']._options = None
  _RESULT_SUCCESS.fields_by_name['value']._serialized_options = b'\362\336\037\014yaml:\"value\"'
  _RESULT_SUCCESS.fields_by_name['signature']._options = None
  _RESULT_SUCCESS.fields_by_name['signature']._serialized_options = b'\362\336\037\020yaml:\"signature\"'
  _RESULT_SUCCESS._options = None
  _RESULT_SUCCESS._serialized_options = b'\210\240\037\000\350\240\037\001'
  _RESULT_FAILED.fields_by_name['error']._options = None
  _RESULT_FAILED.fields_by_name['error']._serialized_options = b'\362\336\037\014yaml:\"error\"'
  _RESULT_FAILED._options = None
  _RESULT_FAILED._serialized_options = b'\210\240\037\000\350\240\037\001'
  _RESULT._options = None
  _RESULT._serialized_options = b'\210\240\037\000\350\240\037\001'
  _globals['_APPLICATIONLINKSTATE']._serialized_start=1551
  _globals['_APPLICATIONLINKSTATE']._serialized_end=1998
  _globals['_APPLICATIONLINK']._serialized_start=131
  _globals['_APPLICATIONLINK']._serialized_end=639
  _globals['_DATA']._serialized_start=641
  _globals['_DATA']._serialized_end=764
  _globals['_ORACLEREQUEST']._serialized_start=767
  _globals['_ORACLEREQUEST']._serialized_end=1212
  _globals['_ORACLEREQUEST_CALLDATA']._serialized_start=1077
  _globals['_ORACLEREQUEST_CALLDATA']._serialized_end=1202
  _globals['_RESULT']._serialized_start=1215
  _globals['_RESULT']._serialized_end=1548
  _globals['_RESULT_SUCCESS']._serialized_start=1360
  _globals['_RESULT_SUCCESS']._serialized_end=1471
  _globals['_RESULT_FAILED']._serialized_start=1473
  _globals['_RESULT_FAILED']._serialized_end=1531
# @@protoc_insertion_point(module_scope)
