# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/auth/module/v1/module.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.app.v1alpha1 import module_pb2 as cosmos_dot_app_dot_v1alpha1_dot_module__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"cosmos/auth/module/v1/module.proto\x12\x15\x63osmos.auth.module.v1\x1a cosmos/app/v1alpha1/module.proto\"\xe6\x01\n\x06Module\x12#\n\rbech32_prefix\x18\x01 \x01(\tR\x0c\x62\x65\x63h32Prefix\x12l\n\x1amodule_account_permissions\x18\x02 \x03(\x0b\x32..cosmos.auth.module.v1.ModuleAccountPermissionR\x18moduleAccountPermissions\x12\x1c\n\tauthority\x18\x03 \x01(\tR\tauthority:+\xba\xc0\x96\xda\x01%\n#github.com/cosmos/cosmos-sdk/x/auth\"U\n\x17ModuleAccountPermission\x12\x18\n\x07\x61\x63\x63ount\x18\x01 \x01(\tR\x07\x61\x63\x63ount\x12 \n\x0bpermissions\x18\x02 \x03(\tR\x0bpermissionsB\x9d\x01\n\x19\x63om.cosmos.auth.module.v1B\x0bModuleProto\xa2\x02\x03\x43\x41M\xaa\x02\x15\x43osmos.Auth.Module.V1\xca\x02\x15\x43osmos\\Auth\\Module\\V1\xe2\x02!Cosmos\\Auth\\Module\\V1\\GPBMetadata\xea\x02\x18\x43osmos::Auth::Module::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.auth.module.v1.module_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\031com.cosmos.auth.module.v1B\013ModuleProto\242\002\003CAM\252\002\025Cosmos.Auth.Module.V1\312\002\025Cosmos\\Auth\\Module\\V1\342\002!Cosmos\\Auth\\Module\\V1\\GPBMetadata\352\002\030Cosmos::Auth::Module::V1'
  _globals['_MODULE']._loaded_options = None
  _globals['_MODULE']._serialized_options = b'\272\300\226\332\001%\n#github.com/cosmos/cosmos-sdk/x/auth'
  _globals['_MODULE']._serialized_start=96
  _globals['_MODULE']._serialized_end=326
  _globals['_MODULEACCOUNTPERMISSION']._serialized_start=328
  _globals['_MODULEACCOUNTPERMISSION']._serialized_end=413
# @@protoc_insertion_point(module_scope)
