// source: canto/inflation/v1/query.proto
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

goog.provide('proto.canto.inflation.v1.QueryEpochMintProvisionResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.DecCoin');

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
proto.canto.inflation.v1.QueryEpochMintProvisionResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.canto.inflation.v1.QueryEpochMintProvisionResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.canto.inflation.v1.QueryEpochMintProvisionResponse.displayName = 'proto.canto.inflation.v1.QueryEpochMintProvisionResponse';
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
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.canto.inflation.v1.QueryEpochMintProvisionResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    epochMintProvision: (f = msg.getEpochMintProvision()) && proto.cosmos.base.v1beta1.DecCoin.toObject(includeInstance, f)
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
 * @return {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse}
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.canto.inflation.v1.QueryEpochMintProvisionResponse;
  return proto.canto.inflation.v1.QueryEpochMintProvisionResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse}
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.v1beta1.DecCoin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.DecCoin.deserializeBinaryFromReader);
      msg.setEpochMintProvision(value);
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
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.canto.inflation.v1.QueryEpochMintProvisionResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEpochMintProvision();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.v1beta1.DecCoin.serializeBinaryToWriter
    );
  }
};


/**
 * optional cosmos.base.v1beta1.DecCoin epoch_mint_provision = 1;
 * @return {?proto.cosmos.base.v1beta1.DecCoin}
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.prototype.getEpochMintProvision = function() {
  return /** @type{?proto.cosmos.base.v1beta1.DecCoin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.DecCoin, 1));
};


/**
 * @param {?proto.cosmos.base.v1beta1.DecCoin|undefined} value
 * @return {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse} returns this
*/
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.prototype.setEpochMintProvision = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.canto.inflation.v1.QueryEpochMintProvisionResponse} returns this
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.prototype.clearEpochMintProvision = function() {
  return this.setEpochMintProvision(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.canto.inflation.v1.QueryEpochMintProvisionResponse.prototype.hasEpochMintProvision = function() {
  return jspb.Message.getField(this, 1) != null;
};


