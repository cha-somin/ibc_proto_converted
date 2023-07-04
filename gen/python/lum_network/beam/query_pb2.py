# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/beam/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from lum_network.beam import beam_pb2 as lum__network_dot_beam_dot_beam__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1clum-network/beam/query.proto\x12\x10lum.network.beam\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1blum-network/beam/beam.proto\"%\n\x13QueryGetBeamRequest\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\"B\n\x14QueryGetBeamResponse\x12*\n\x04\x62\x65\x61m\x18\x01 \x01(\x0b\x32\x16.lum.network.beam.BeamR\x04\x62\x65\x61m\"\x93\x01\n\x16QueryFetchBeamsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x31\n\x05state\x18\x02 \x01(\x0e\x32\x1b.lum.network.beam.BeamStateR\x05state\"\x90\x01\n\x17QueryFetchBeamsResponse\x12,\n\x05\x62\x65\x61ms\x18\x01 \x03(\x0b\x32\x16.lum.network.beam.BeamR\x05\x62\x65\x61ms\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"i\n\x1fQueryFetchBeamsOpenQueueRequest\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x86\x01\n QueryFetchBeamsOpenQueueResponse\x12\x19\n\x08\x62\x65\x61m_ids\x18\x01 \x03(\tR\x07\x62\x65\x61mIds\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\x9a\x03\n\x05Query\x12v\n\x04\x42\x65\x61m\x12%.lum.network.beam.QueryGetBeamRequest\x1a&.lum.network.beam.QueryGetBeamResponse\"\x1f\x82\xd3\xe4\x93\x02\x19\x12\x17/lum-network/beams/{id}\x12x\n\x05\x42\x65\x61ms\x12(.lum.network.beam.QueryFetchBeamsRequest\x1a).lum.network.beam.QueryFetchBeamsResponse\"\x1a\x82\xd3\xe4\x93\x02\x14\x12\x12/lum-network/beams\x12\x9e\x01\n\x0e\x42\x65\x61msOpenQueue\x12\x31.lum.network.beam.QueryFetchBeamsOpenQueueRequest\x1a\x32.lum.network.beam.QueryFetchBeamsOpenQueueResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/lum-network/beams-open-queueB\xaf\x01\n\x14\x63om.lum.network.beamB\nQueryProtoP\x01Z)github.com/lum-network/chain/x/beam/types\xa2\x02\x03LNB\xaa\x02\x10Lum.Network.Beam\xca\x02\x10Lum\\Network\\Beam\xe2\x02\x1cLum\\Network\\Beam\\GPBMetadata\xea\x02\x12Lum::Network::Beamb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.beam.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.lum.network.beamB\nQueryProtoP\001Z)github.com/lum-network/chain/x/beam/types\242\002\003LNB\252\002\020Lum.Network.Beam\312\002\020Lum\\Network\\Beam\342\002\034Lum\\Network\\Beam\\GPBMetadata\352\002\022Lum::Network::Beam'
  _QUERY.methods_by_name['Beam']._options = None
  _QUERY.methods_by_name['Beam']._serialized_options = b'\202\323\344\223\002\031\022\027/lum-network/beams/{id}'
  _QUERY.methods_by_name['Beams']._options = None
  _QUERY.methods_by_name['Beams']._serialized_options = b'\202\323\344\223\002\024\022\022/lum-network/beams'
  _QUERY.methods_by_name['BeamsOpenQueue']._options = None
  _QUERY.methods_by_name['BeamsOpenQueue']._serialized_options = b'\202\323\344\223\002\037\022\035/lum-network/beams-open-queue'
  _globals['_QUERYGETBEAMREQUEST']._serialized_start=153
  _globals['_QUERYGETBEAMREQUEST']._serialized_end=190
  _globals['_QUERYGETBEAMRESPONSE']._serialized_start=192
  _globals['_QUERYGETBEAMRESPONSE']._serialized_end=258
  _globals['_QUERYFETCHBEAMSREQUEST']._serialized_start=261
  _globals['_QUERYFETCHBEAMSREQUEST']._serialized_end=408
  _globals['_QUERYFETCHBEAMSRESPONSE']._serialized_start=411
  _globals['_QUERYFETCHBEAMSRESPONSE']._serialized_end=555
  _globals['_QUERYFETCHBEAMSOPENQUEUEREQUEST']._serialized_start=557
  _globals['_QUERYFETCHBEAMSOPENQUEUEREQUEST']._serialized_end=662
  _globals['_QUERYFETCHBEAMSOPENQUEUERESPONSE']._serialized_start=665
  _globals['_QUERYFETCHBEAMSOPENQUEUERESPONSE']._serialized_end=799
  _globals['_QUERY']._serialized_start=802
  _globals['_QUERY']._serialized_end=1212
# @@protoc_insertion_point(module_scope)