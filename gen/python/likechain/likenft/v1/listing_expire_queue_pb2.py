# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: likechain/likenft/v1/listing_expire_queue.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/likechain/likenft/v1/listing_expire_queue.proto\x12\x14likechain.likenft.v1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x81\x01\n\x17ListingExpireQueueEntry\x12\x45\n\x0b\x65xpire_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\nexpireTime\x12\x1f\n\x0blisting_key\x18\x02 \x01(\x0cR\nlistingKeyB\xdc\x01\n\x18\x63om.likechain.likenft.v1B\x17ListingExpireQueueProtoP\x01Z5github.com/likecoin/likecoin-chain/v4/x/likenft/types\xa2\x02\x03LLX\xaa\x02\x14Likechain.Likenft.V1\xca\x02\x14Likechain\\Likenft\\V1\xe2\x02 Likechain\\Likenft\\V1\\GPBMetadata\xea\x02\x16Likechain::Likenft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'likechain.likenft.v1.listing_expire_queue_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.likechain.likenft.v1B\027ListingExpireQueueProtoP\001Z5github.com/likecoin/likecoin-chain/v4/x/likenft/types\242\002\003LLX\252\002\024Likechain.Likenft.V1\312\002\024Likechain\\Likenft\\V1\342\002 Likechain\\Likenft\\V1\\GPBMetadata\352\002\026Likechain::Likenft::V1'
  _LISTINGEXPIREQUEUEENTRY.fields_by_name['expire_time']._options = None
  _LISTINGEXPIREQUEUEENTRY.fields_by_name['expire_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_LISTINGEXPIREQUEUEENTRY']._serialized_start=129
  _globals['_LISTINGEXPIREQUEUEENTRY']._serialized_end=258
# @@protoc_insertion_point(module_scope)
