# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/datadeal/v2alpha1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from panacea.datadeal.v2alpha1 import deal_pb2 as panacea_dot_datadeal_dot_v2alpha1_dot_deal__pb2
from panacea.datadeal.v2alpha1 import tx_pb2 as panacea_dot_datadeal_dot_v2alpha1_dot_tx__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%panacea/datadeal/v2alpha1/query.proto\x12\x19panacea.datadeal.v2alpha1\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a$panacea/datadeal/v2alpha1/deal.proto\x1a\"panacea/datadeal/v2alpha1/tx.proto\x1a\x19google/protobuf/any.proto\x1a\x14gogoproto/gogo.proto\"+\n\x10QueryDealRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\"H\n\x11QueryDealResponse\x12\x33\n\x04\x64\x65\x61l\x18\x01 \x01(\x0b\x32\x1f.panacea.datadeal.v2alpha1.DealR\x04\x64\x65\x61l\"[\n\x11QueryDealsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9a\x01\n\x12QueryDealsResponse\x12;\n\x05\x64\x65\x61ls\x18\x01 \x03(\x0b\x32\x1f.panacea.datadeal.v2alpha1.DealB\x04\xc8\xde\x1f\x00R\x05\x64\x65\x61ls\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"L\n\x14QueryDataCertRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\x12\x1b\n\tdata_hash\x18\x02 \x01(\tR\x08\x64\x61taHash\"Y\n\x15QueryDataCertResponse\x12@\n\tdata_cert\x18\x01 \x01(\x0b\x32#.panacea.datadeal.v2alpha1.DataCertR\x08\x64\x61taCert\"x\n\x15QueryDataCertsRequest\x12\x17\n\x07\x64\x65\x61l_id\x18\x01 \x01(\x04R\x06\x64\x65\x61lId\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xab\x01\n\x16QueryDataCertsResponse\x12H\n\ndata_certs\x18\x01 \x03(\x0b\x32#.panacea.datadeal.v2alpha1.DataCertB\x04\xc8\xde\x1f\x00R\tdataCerts\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\x9d\x05\n\x05Query\x12\x95\x01\n\x04\x44\x65\x61l\x12+.panacea.datadeal.v2alpha1.QueryDealRequest\x1a,.panacea.datadeal.v2alpha1.QueryDealResponse\"2\x82\xd3\xe4\x93\x02,\x12*/panacea/datadeal/v2alpha1/deals/{deal_id}\x12\x8e\x01\n\x05\x44\x65\x61ls\x12,.panacea.datadeal.v2alpha1.QueryDealsRequest\x1a-.panacea.datadeal.v2alpha1.QueryDealsResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /panacea/datadeal/v2alpha1/deals\x12\xb8\x01\n\x08\x44\x61taCert\x12/.panacea.datadeal.v2alpha1.QueryDataCertRequest\x1a\x30.panacea.datadeal.v2alpha1.QueryDataCertResponse\"I\x82\xd3\xe4\x93\x02\x43\x12\x41/panacea/datadeal/v2alpha1/deals/{deal_id}/data_certs/{data_hash}\x12\xaf\x01\n\tDataCerts\x12\x30.panacea.datadeal.v2alpha1.QueryDataCertsRequest\x1a\x31.panacea.datadeal.v2alpha1.QueryDataCertsResponse\"=\x82\xd3\xe4\x93\x02\x37\x12\x35/panacea/datadeal/v2alpha1/deals/{deal_id}/data_certsB\xe7\x01\n\x1d\x63om.panacea.datadeal.v2alpha1B\nQueryProtoP\x01Z4github.com/medibloc/panacea-core/v2/x/datadeal/types\xa2\x02\x03PDX\xaa\x02\x19Panacea.Datadeal.V2alpha1\xca\x02\x19Panacea\\Datadeal\\V2alpha1\xe2\x02%Panacea\\Datadeal\\V2alpha1\\GPBMetadata\xea\x02\x1bPanacea::Datadeal::V2alpha1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.datadeal.v2alpha1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.panacea.datadeal.v2alpha1B\nQueryProtoP\001Z4github.com/medibloc/panacea-core/v2/x/datadeal/types\242\002\003PDX\252\002\031Panacea.Datadeal.V2alpha1\312\002\031Panacea\\Datadeal\\V2alpha1\342\002%Panacea\\Datadeal\\V2alpha1\\GPBMetadata\352\002\033Panacea::Datadeal::V2alpha1'
  _QUERYDEALSRESPONSE.fields_by_name['deals']._options = None
  _QUERYDEALSRESPONSE.fields_by_name['deals']._serialized_options = b'\310\336\037\000'
  _QUERYDATACERTSRESPONSE.fields_by_name['data_certs']._options = None
  _QUERYDATACERTSRESPONSE.fields_by_name['data_certs']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Deal']._options = None
  _QUERY.methods_by_name['Deal']._serialized_options = b'\202\323\344\223\002,\022*/panacea/datadeal/v2alpha1/deals/{deal_id}'
  _QUERY.methods_by_name['Deals']._options = None
  _QUERY.methods_by_name['Deals']._serialized_options = b'\202\323\344\223\002\"\022 /panacea/datadeal/v2alpha1/deals'
  _QUERY.methods_by_name['DataCert']._options = None
  _QUERY.methods_by_name['DataCert']._serialized_options = b'\202\323\344\223\002C\022A/panacea/datadeal/v2alpha1/deals/{deal_id}/data_certs/{data_hash}'
  _QUERY.methods_by_name['DataCerts']._options = None
  _QUERY.methods_by_name['DataCerts']._serialized_options = b'\202\323\344\223\0027\0225/panacea/datadeal/v2alpha1/deals/{deal_id}/data_certs'
  _globals['_QUERYDEALREQUEST']._serialized_start=265
  _globals['_QUERYDEALREQUEST']._serialized_end=308
  _globals['_QUERYDEALRESPONSE']._serialized_start=310
  _globals['_QUERYDEALRESPONSE']._serialized_end=382
  _globals['_QUERYDEALSREQUEST']._serialized_start=384
  _globals['_QUERYDEALSREQUEST']._serialized_end=475
  _globals['_QUERYDEALSRESPONSE']._serialized_start=478
  _globals['_QUERYDEALSRESPONSE']._serialized_end=632
  _globals['_QUERYDATACERTREQUEST']._serialized_start=634
  _globals['_QUERYDATACERTREQUEST']._serialized_end=710
  _globals['_QUERYDATACERTRESPONSE']._serialized_start=712
  _globals['_QUERYDATACERTRESPONSE']._serialized_end=801
  _globals['_QUERYDATACERTSREQUEST']._serialized_start=803
  _globals['_QUERYDATACERTSREQUEST']._serialized_end=923
  _globals['_QUERYDATACERTSRESPONSE']._serialized_start=926
  _globals['_QUERYDATACERTSRESPONSE']._serialized_end=1097
  _globals['_QUERY']._serialized_start=1100
  _globals['_QUERY']._serialized_end=1769
# @@protoc_insertion_point(module_scope)
