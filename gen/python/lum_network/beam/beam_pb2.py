# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/beam/beam.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1blum-network/beam/beam.proto\x12\x10lum.network.beam\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"^\n\tBeamMedia\x12\x1a\n\x08mimetype\x18\x01 \x01(\tR\x08mimetype\x12\x10\n\x03url\x18\x02 \x01(\tR\x03url\x12#\n\rthumbnail_url\x18\x03 \x01(\tR\x0cthumbnailUrl\"f\n\x0c\x42\x65\x61mReviewer\x12\x1f\n\x0breviewer_id\x18\x01 \x01(\tR\nreviewerId\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12!\n\x0cis_anonymous\x18\x03 \x01(\x08R\x0bisAnonymous\"R\n\x0c\x42\x65\x61mVerifier\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x10\n\x03url\x18\x02 \x01(\tR\x03url\x12\x1c\n\tsignature\x18\x03 \x01(\tR\tsignature\"\xd3\x02\n\nBeamReward\x12\x18\n\x07trigger\x18\x01 \x01(\tR\x07trigger\x12\x16\n\x06\x61mount\x18\x02 \x01(\x02R\x06\x61mount\x12\x1d\n\nmax_amount\x18\x03 \x01(\x02R\tmaxAmount\x12\x1a\n\x08\x63urrency\x18\x04 \x01(\tR\x08\x63urrency\x12\x16\n\x06status\x18\x05 \x01(\tR\x06status\x12H\n\x07\x64\x65tails\x18\x06 \x03(\x0b\x32..lum.network.beam.BeamReward.BeamRewardDetailsR\x07\x64\x65tails\x1av\n\x11\x42\x65\x61mRewardDetails\x12\x12\n\x04type\x18\x01 \x01(\tR\x04type\x12\x16\n\x06\x61mount\x18\x02 \x01(\x02R\x06\x61mount\x12\x1d\n\nmax_amount\x18\x03 \x01(\x02R\tmaxAmount\x12\x16\n\x06status\x18\x04 \x01(\tR\x06status\"\x96\x05\n\x12\x42\x65\x61mMerchantReview\x12\x19\n\x08order_id\x18\x01 \x01(\tR\x07orderId\x12\x1b\n\treview_id\x18\x02 \x01(\tR\x08reviewId\x12!\n\x0cmerchant_url\x18\x03 \x01(\tR\x0bmerchantUrl\x12\x1d\n\nrating_url\x18\x04 \x01(\tR\tratingUrl\x12\x1d\n\nreview_url\x18\x05 \x01(\tR\treviewUrl\x12+\n\x11\x63ollection_method\x18\x06 \x01(\tR\x10\x63ollectionMethod\x12\x1c\n\ttimestamp\x18\x07 \x01(\tR\ttimestamp\x12W\n\x07ratings\x18\x08 \x01(\x0b\x32=.lum.network.beam.BeamMerchantReview.BeamMerchantReviewRatingR\x07ratings\x12\x14\n\x05title\x18\t \x01(\tR\x05title\x12X\n\x07\x63ontent\x18\n \x01(\x0b\x32>.lum.network.beam.BeamMerchantReview.BeamMerchantReviewContentR\x07\x63ontent\x1aq\n\x18\x42\x65\x61mMerchantReviewRating\x12\x18\n\x07overall\x18\x01 \x01(\x02R\x07overall\x12)\n\x10\x63ustomer_service\x18\x02 \x01(\x02R\x0f\x63ustomerService\x12\x10\n\x03nps\x18\x03 \x01(\x02R\x03nps\x1a`\n\x19\x42\x65\x61mMerchantReviewContent\x12\x18\n\x07overall\x18\x01 \x01(\tR\x07overall\x12)\n\x10\x63ustomer_service\x18\x02 \x01(\tR\x0f\x63ustomerService\"\xca\x07\n\x11\x42\x65\x61mProductReview\x12\x19\n\x08order_id\x18\x01 \x01(\tR\x07orderId\x12\x1b\n\treview_id\x18\x02 \x01(\tR\x08reviewId\x12\x1d\n\nrating_url\x18\x03 \x01(\tR\tratingUrl\x12\x1d\n\nreview_url\x18\x04 \x01(\tR\treviewUrl\x12+\n\x11\x63ollection_method\x18\x05 \x01(\tR\x10\x63ollectionMethod\x12\x1c\n\ttimestamp\x18\x06 \x01(\tR\ttimestamp\x12U\n\x07ratings\x18\x07 \x01(\x0b\x32;.lum.network.beam.BeamProductReview.BeamProductReviewRatingR\x07ratings\x12\x14\n\x05title\x18\x08 \x01(\tR\x05title\x12V\n\x07\x63ontent\x18\t \x01(\x0b\x32<.lum.network.beam.BeamProductReview.BeamProductReviewContentR\x07\x63ontent\x12\x33\n\x06medias\x18\n \x03(\x0b\x32\x1b.lum.network.beam.BeamMediaR\x06medias\x12K\n\x08products\x18\x0b \x03(\x0b\x32/.lum.network.beam.BeamProductReview.BeamProductR\x08products\x1aM\n\x17\x42\x65\x61mProductReviewRating\x12\x18\n\x07overall\x18\x01 \x01(\x02R\x07overall\x12\x18\n\x07quality\x18\x02 \x01(\x02R\x07quality\x1a\\\n\x18\x42\x65\x61mProductReviewContent\x12\x18\n\x07overall\x18\x01 \x01(\tR\x07overall\x12\x12\n\x04pros\x18\x02 \x01(\tR\x04pros\x12\x12\n\x04\x63ons\x18\x03 \x01(\tR\x04\x63ons\x1a\xff\x01\n\x0b\x42\x65\x61mProduct\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x10\n\x03url\x18\x02 \x01(\tR\x03url\x12\x12\n\x04urls\x18\x03 \x03(\tR\x04urls\x12P\n\x03ids\x18\x04 \x01(\x0b\x32>.lum.network.beam.BeamProductReview.BeamProduct.BeamProductIdsR\x03ids\x1a\x64\n\x0e\x42\x65\x61mProductIds\x12\x14\n\x05gtins\x18\x01 \x03(\tR\x05gtins\x12\x12\n\x04mpns\x18\x02 \x03(\tR\x04mpns\x12\x12\n\x04skus\x18\x03 \x03(\tR\x04skus\x12\x14\n\x05\x61sins\x18\x04 \x03(\tR\x05\x61sins\"\xd7\x02\n\x08\x42\x65\x61mData\x12\x34\n\x06reward\x18\x01 \x01(\x0b\x32\x1c.lum.network.beam.BeamRewardR\x06reward\x12:\n\x08verifier\x18\x02 \x01(\x0b\x32\x1e.lum.network.beam.BeamVerifierR\x08verifier\x12:\n\x08reviewer\x18\x03 \x01(\x0b\x32\x1e.lum.network.beam.BeamReviewerR\x08reviewer\x12M\n\x0fmerchant_review\x18\x04 \x01(\x0b\x32$.lum.network.beam.BeamMerchantReviewR\x0emerchantReview\x12N\n\x10products_reviews\x18\x05 \x03(\x0b\x32#.lum.network.beam.BeamProductReviewR\x0fproductsReviews\"\xa2\x05\n\x04\x42\x65\x61m\x12\'\n\x0f\x63reator_address\x18\x01 \x01(\tR\x0e\x63reatorAddress\x12\x0e\n\x02id\x18\x02 \x01(\tR\x02id\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x33\n\x06status\x18\x04 \x01(\x0e\x32\x1b.lum.network.beam.BeamStateR\x06status\x12\x16\n\x06secret\x18\x05 \x01(\tR\x06secret\x12#\n\rclaim_address\x18\x06 \x01(\tR\x0c\x63laimAddress\x12\'\n\x0f\x66unds_withdrawn\x18\x07 \x01(\x08R\x0e\x66undsWithdrawn\x12\x18\n\x07\x63laimed\x18\x08 \x01(\x08R\x07\x63laimed\x12#\n\rcancel_reason\x18\t \x01(\tR\x0c\x63\x61ncelReason\x12!\n\x0chide_content\x18\n \x01(\x08R\x0bhideContent\x12\x16\n\x06schema\x18\x0b \x01(\tR\x06schema\x12.\n\x04\x64\x61ta\x18\x0c \x01(\x0b\x32\x1a.lum.network.beam.BeamDataR\x04\x64\x61ta\x12\x33\n\x16\x63laim_expires_at_block\x18\r \x01(\x05R\x13\x63laimExpiresAtBlock\x12&\n\x0f\x63loses_at_block\x18\x0e \x01(\x05R\rclosesAtBlock\x12\x43\n\ncreated_at\x18\x0f \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tcreatedAt\x12\x41\n\tclosed_at\x18\x10 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x08\x63losedAt*\x89\x01\n\tBeamState\x12%\n\x0bUNSPECIFIED\x10\x00\x1a\x14\x8a\x9d \x10StateUnspecified\x12\x17\n\x04OPEN\x10\x01\x1a\r\x8a\x9d \tStateOpen\x12\x1f\n\x08\x43\x41NCELED\x10\x02\x1a\x11\x8a\x9d \rStateCanceled\x12\x1b\n\x06\x43LOSED\x10\x03\x1a\x0f\x8a\x9d \x0bStateClosedB\xae\x01\n\x14\x63om.lum.network.beamB\tBeamProtoP\x01Z)github.com/lum-network/chain/x/beam/types\xa2\x02\x03LNB\xaa\x02\x10Lum.Network.Beam\xca\x02\x10Lum\\Network\\Beam\xe2\x02\x1cLum\\Network\\Beam\\GPBMetadata\xea\x02\x12Lum::Network::Beamb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.beam.beam_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.lum.network.beamB\tBeamProtoP\001Z)github.com/lum-network/chain/x/beam/types\242\002\003LNB\252\002\020Lum.Network.Beam\312\002\020Lum\\Network\\Beam\342\002\034Lum\\Network\\Beam\\GPBMetadata\352\002\022Lum::Network::Beam'
  _BEAMSTATE.values_by_name["UNSPECIFIED"]._options = None
  _BEAMSTATE.values_by_name["UNSPECIFIED"]._serialized_options = b'\212\235 \020StateUnspecified'
  _BEAMSTATE.values_by_name["OPEN"]._options = None
  _BEAMSTATE.values_by_name["OPEN"]._serialized_options = b'\212\235 \tStateOpen'
  _BEAMSTATE.values_by_name["CANCELED"]._options = None
  _BEAMSTATE.values_by_name["CANCELED"]._serialized_options = b'\212\235 \rStateCanceled'
  _BEAMSTATE.values_by_name["CLOSED"]._options = None
  _BEAMSTATE.values_by_name["CLOSED"]._serialized_options = b'\212\235 \013StateClosed'
  _BEAM.fields_by_name['amount']._options = None
  _BEAM.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _BEAM.fields_by_name['created_at']._options = None
  _BEAM.fields_by_name['created_at']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _BEAM.fields_by_name['closed_at']._options = None
  _BEAM.fields_by_name['closed_at']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_BEAMSTATE']._serialized_start=3424
  _globals['_BEAMSTATE']._serialized_end=3561
  _globals['_BEAMMEDIA']._serialized_start=136
  _globals['_BEAMMEDIA']._serialized_end=230
  _globals['_BEAMREVIEWER']._serialized_start=232
  _globals['_BEAMREVIEWER']._serialized_end=334
  _globals['_BEAMVERIFIER']._serialized_start=336
  _globals['_BEAMVERIFIER']._serialized_end=418
  _globals['_BEAMREWARD']._serialized_start=421
  _globals['_BEAMREWARD']._serialized_end=760
  _globals['_BEAMREWARD_BEAMREWARDDETAILS']._serialized_start=642
  _globals['_BEAMREWARD_BEAMREWARDDETAILS']._serialized_end=760
  _globals['_BEAMMERCHANTREVIEW']._serialized_start=763
  _globals['_BEAMMERCHANTREVIEW']._serialized_end=1425
  _globals['_BEAMMERCHANTREVIEW_BEAMMERCHANTREVIEWRATING']._serialized_start=1214
  _globals['_BEAMMERCHANTREVIEW_BEAMMERCHANTREVIEWRATING']._serialized_end=1327
  _globals['_BEAMMERCHANTREVIEW_BEAMMERCHANTREVIEWCONTENT']._serialized_start=1329
  _globals['_BEAMMERCHANTREVIEW_BEAMMERCHANTREVIEWCONTENT']._serialized_end=1425
  _globals['_BEAMPRODUCTREVIEW']._serialized_start=1428
  _globals['_BEAMPRODUCTREVIEW']._serialized_end=2398
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCTREVIEWRATING']._serialized_start=1969
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCTREVIEWRATING']._serialized_end=2046
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCTREVIEWCONTENT']._serialized_start=2048
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCTREVIEWCONTENT']._serialized_end=2140
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCT']._serialized_start=2143
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCT']._serialized_end=2398
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCT_BEAMPRODUCTIDS']._serialized_start=2298
  _globals['_BEAMPRODUCTREVIEW_BEAMPRODUCT_BEAMPRODUCTIDS']._serialized_end=2398
  _globals['_BEAMDATA']._serialized_start=2401
  _globals['_BEAMDATA']._serialized_end=2744
  _globals['_BEAM']._serialized_start=2747
  _globals['_BEAM']._serialized_end=3421
# @@protoc_insertion_point(module_scope)
