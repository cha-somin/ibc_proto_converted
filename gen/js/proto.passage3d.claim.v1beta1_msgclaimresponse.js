// source: passage3d/claim/v1beta1/tx.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.passage3d.claim.v1beta1.MsgClaimResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.passage3d.claim.v1beta1.MsgClaimResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.passage3d.claim.v1beta1.MsgClaimResponse.displayName = 'proto.passage3d.claim.v1beta1.MsgClaimResponse';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.passage3d.claim.v1beta1.MsgClaimResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.passage3d.claim.v1beta1.MsgClaimResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    claimedAmount: (f = msg.getClaimedAmount()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.passage3d.claim.v1beta1.MsgClaimResponse}
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.passage3d.claim.v1beta1.MsgClaimResponse;
  return proto.passage3d.claim.v1beta1.MsgClaimResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.passage3d.claim.v1beta1.MsgClaimResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.passage3d.claim.v1beta1.MsgClaimResponse}
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 2:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setClaimedAmount(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.passage3d.claim.v1beta1.MsgClaimResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.passage3d.claim.v1beta1.MsgClaimResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getClaimedAmount();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.base.v1beta1.Coin claimed_amount = 2;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.prototype.getClaimedAmount = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 2));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.passage3d.claim.v1beta1.MsgClaimResponse} returns this
*/
proto.passage3d.claim.v1beta1.MsgClaimResponse.prototype.setClaimedAmount = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.passage3d.claim.v1beta1.MsgClaimResponse} returns this
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.prototype.clearClaimedAmount = function() {
  return this.setClaimedAmount(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.passage3d.claim.v1beta1.MsgClaimResponse.prototype.hasClaimedAmount = function() {
  return jspb.Message.getField(this, 2) != null;
};


