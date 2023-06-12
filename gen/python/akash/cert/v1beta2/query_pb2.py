# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/cert/v1beta2/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from akash.cert.v1beta2 import cert_pb2 as akash_dot_cert_dot_v1beta2_dot_cert__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x61kash/cert/v1beta2/query.proto\x12\x12\x61kash.cert.v1beta2\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1d\x61kash/cert/v1beta2/cert.proto\"\xb8\x01\n\x13\x43\x65rtificateResponse\x12l\n\x0b\x63\x65rtificate\x18\x01 \x01(\x0b\x32\x1f.akash.cert.v1beta2.CertificateB)\xc8\xde\x1f\x00\xea\xde\x1f\x0b\x63\x65rtificate\xf2\xde\x1f\x12yaml:\"certificate\"R\x0b\x63\x65rtificate\x12\x33\n\x06serial\x18\x02 \x01(\tB\x1b\xea\xde\x1f\x06serial\xf2\xde\x1f\ryaml:\"serial\"R\x06serial\"\xa7\x01\n\x18QueryCertificatesRequest\x12\x43\n\x06\x66ilter\x18\x01 \x01(\x0b\x32%.akash.cert.v1beta2.CertificateFilterB\x04\xc8\xde\x1f\x00R\x06\x66ilter\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xcf\x01\n\x19QueryCertificatesResponse\x12i\n\x0c\x63\x65rtificates\x18\x01 \x03(\x0b\x32\'.akash.cert.v1beta2.CertificateResponseB\x1c\xc8\xde\x1f\x00\xaa\xdf\x1f\x14\x43\x65rtificatesResponseR\x0c\x63\x65rtificates\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xa4\x01\n\x05Query\x12\x9a\x01\n\x0c\x43\x65rtificates\x12,.akash.cert.v1beta2.QueryCertificatesRequest\x1a-.akash.cert.v1beta2.QueryCertificatesResponse\"-\x82\xd3\xe4\x93\x02\'\x12%/akash/cert/v1beta3/certificates/listB\xc7\x01\n\x16\x63om.akash.cert.v1beta2B\nQueryProtoP\x01Z7github.com/akash-network/akash-api/go/node/cert/v1beta2\xa2\x02\x03\x41\x43X\xaa\x02\x12\x41kash.Cert.V1beta2\xca\x02\x12\x41kash\\Cert\\V1beta2\xe2\x02\x1e\x41kash\\Cert\\V1beta2\\GPBMetadata\xea\x02\x14\x41kash::Cert::V1beta2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.cert.v1beta2.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.akash.cert.v1beta2B\nQueryProtoP\001Z7github.com/akash-network/akash-api/go/node/cert/v1beta2\242\002\003ACX\252\002\022Akash.Cert.V1beta2\312\002\022Akash\\Cert\\V1beta2\342\002\036Akash\\Cert\\V1beta2\\GPBMetadata\352\002\024Akash::Cert::V1beta2'
  _CERTIFICATERESPONSE.fields_by_name['certificate']._options = None
  _CERTIFICATERESPONSE.fields_by_name['certificate']._serialized_options = b'\310\336\037\000\352\336\037\013certificate\362\336\037\022yaml:\"certificate\"'
  _CERTIFICATERESPONSE.fields_by_name['serial']._options = None
  _CERTIFICATERESPONSE.fields_by_name['serial']._serialized_options = b'\352\336\037\006serial\362\336\037\ryaml:\"serial\"'
  _QUERYCERTIFICATESREQUEST.fields_by_name['filter']._options = None
  _QUERYCERTIFICATESREQUEST.fields_by_name['filter']._serialized_options = b'\310\336\037\000'
  _QUERYCERTIFICATESRESPONSE.fields_by_name['certificates']._options = None
  _QUERYCERTIFICATESRESPONSE.fields_by_name['certificates']._serialized_options = b'\310\336\037\000\252\337\037\024CertificatesResponse'
  _QUERY.methods_by_name['Certificates']._options = None
  _QUERY.methods_by_name['Certificates']._serialized_options = b'\202\323\344\223\002\'\022%/akash/cert/v1beta3/certificates/list'
  _globals['_CERTIFICATERESPONSE']._serialized_start=182
  _globals['_CERTIFICATERESPONSE']._serialized_end=366
  _globals['_QUERYCERTIFICATESREQUEST']._serialized_start=369
  _globals['_QUERYCERTIFICATESREQUEST']._serialized_end=536
  _globals['_QUERYCERTIFICATESRESPONSE']._serialized_start=539
  _globals['_QUERYCERTIFICATESRESPONSE']._serialized_end=746
  _globals['_QUERY']._serialized_start=749
  _globals['_QUERY']._serialized_end=913
# @@protoc_insertion_point(module_scope)
