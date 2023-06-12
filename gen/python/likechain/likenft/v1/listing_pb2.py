# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: likechain/likenft/v1/listing.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"likechain/likenft/v1/listing.proto\x12\x14likechain.likenft.v1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xde\x01\n\x07Listing\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x15\n\x06nft_id\x18\x02 \x01(\tR\x05nftId\x12\x16\n\x06seller\x18\x03 \x01(\tR\x06seller\x12\x14\n\x05price\x18\x04 \x01(\x04R\x05price\x12\x44\n\nexpiration\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\nexpiration\x12-\n\x13\x66ull_pay_to_royalty\x18\x06 \x01(\x08R\x10\x66ullPayToRoyalty\"\x9c\x02\n\x12ListingStoreRecord\x12\x19\n\x08\x63lass_id\x18\x01 \x01(\tR\x07\x63lassId\x12\x15\n\x06nft_id\x18\x02 \x01(\tR\x05nftId\x12I\n\x06seller\x18\x03 \x01(\x0c\x42\x31\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddressR\x06seller\x12\x14\n\x05price\x18\x04 \x01(\x04R\x05price\x12\x44\n\nexpiration\x18\x05 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\nexpiration\x12-\n\x13\x66ull_pay_to_royalty\x18\x06 \x01(\x08R\x10\x66ullPayToRoyaltyB\xd1\x01\n\x18\x63om.likechain.likenft.v1B\x0cListingProtoP\x01Z5github.com/likecoin/likecoin-chain/v4/x/likenft/types\xa2\x02\x03LLX\xaa\x02\x14Likechain.Likenft.V1\xca\x02\x14Likechain\\Likenft\\V1\xe2\x02 Likechain\\Likenft\\V1\\GPBMetadata\xea\x02\x16Likechain::Likenft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'likechain.likenft.v1.listing_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.likechain.likenft.v1B\014ListingProtoP\001Z5github.com/likecoin/likecoin-chain/v4/x/likenft/types\242\002\003LLX\252\002\024Likechain.Likenft.V1\312\002\024Likechain\\Likenft\\V1\342\002 Likechain\\Likenft\\V1\\GPBMetadata\352\002\026Likechain::Likenft::V1'
  _LISTING.fields_by_name['expiration']._options = None
  _LISTING.fields_by_name['expiration']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _LISTINGSTORERECORD.fields_by_name['seller']._options = None
  _LISTINGSTORERECORD.fields_by_name['seller']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress'
  _LISTINGSTORERECORD.fields_by_name['expiration']._options = None
  _LISTINGSTORERECORD.fields_by_name['expiration']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_LISTING']._serialized_start=116
  _globals['_LISTING']._serialized_end=338
  _globals['_LISTINGSTORERECORD']._serialized_start=341
  _globals['_LISTINGSTORERECORD']._serialized_end=625
# @@protoc_insertion_point(module_scope)
