# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/cert/v1beta3/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from akash.cert.v1beta3 import cert_pb2 as akash_dot_cert_dot_v1beta3_dot_cert__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n akash/cert/v1beta3/genesis.proto\x12\x12\x61kash.cert.v1beta3\x1a\x1d\x61kash/cert/v1beta3/cert.proto\x1a\x14gogoproto/gogo.proto\"\xb3\x01\n\x12GenesisCertificate\x12/\n\x05owner\x18\x01 \x01(\tB\x19\xea\xde\x1f\x05owner\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12l\n\x0b\x63\x65rtificate\x18\x02 \x01(\x0b\x32\x1f.akash.cert.v1beta3.CertificateB)\xc8\xde\x1f\x00\xea\xde\x1f\x0b\x63\x65rtificate\xf2\xde\x1f\x12yaml:\"certificate\"R\x0b\x63\x65rtificate\"\x9f\x01\n\x0cGenesisState\x12\x8e\x01\n\x0c\x63\x65rtificates\x18\x01 \x03(\x0b\x32&.akash.cert.v1beta3.GenesisCertificateBB\xc8\xde\x1f\x00\xea\xde\x1f\x0c\x63\x65rtificates\xf2\xde\x1f\x13yaml:\"certificates\"\xaa\xdf\x1f\x13GenesisCertificatesR\x0c\x63\x65rtificatesB\xc9\x01\n\x16\x63om.akash.cert.v1beta3B\x0cGenesisProtoP\x01Z7github.com/akash-network/akash-api/go/node/cert/v1beta3\xa2\x02\x03\x41\x43X\xaa\x02\x12\x41kash.Cert.V1beta3\xca\x02\x12\x41kash\\Cert\\V1beta3\xe2\x02\x1e\x41kash\\Cert\\V1beta3\\GPBMetadata\xea\x02\x14\x41kash::Cert::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.cert.v1beta3.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.akash.cert.v1beta3B\014GenesisProtoP\001Z7github.com/akash-network/akash-api/go/node/cert/v1beta3\242\002\003ACX\252\002\022Akash.Cert.V1beta3\312\002\022Akash\\Cert\\V1beta3\342\002\036Akash\\Cert\\V1beta3\\GPBMetadata\352\002\024Akash::Cert::V1beta3'
  _GENESISCERTIFICATE.fields_by_name['owner']._options = None
  _GENESISCERTIFICATE.fields_by_name['owner']._serialized_options = b'\352\336\037\005owner\362\336\037\014yaml:\"owner\"'
  _GENESISCERTIFICATE.fields_by_name['certificate']._options = None
  _GENESISCERTIFICATE.fields_by_name['certificate']._serialized_options = b'\310\336\037\000\352\336\037\013certificate\362\336\037\022yaml:\"certificate\"'
  _GENESISSTATE.fields_by_name['certificates']._options = None
  _GENESISSTATE.fields_by_name['certificates']._serialized_options = b'\310\336\037\000\352\336\037\014certificates\362\336\037\023yaml:\"certificates\"\252\337\037\023GenesisCertificates'
  _globals['_GENESISCERTIFICATE']._serialized_start=110
  _globals['_GENESISCERTIFICATE']._serialized_end=289
  _globals['_GENESISSTATE']._serialized_start=292
  _globals['_GENESISSTATE']._serialized_end=451
# @@protoc_insertion_point(module_scope)
