// source: cudos/nft/query.proto
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

goog.provide('proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cudosnode.cudosnode.nft.Denom');

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
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.displayName = 'proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse';
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
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    denom: (f = msg.getDenom()) && proto.cudosnode.cudosnode.nft.Denom.toObject(includeInstance, f)
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
 * @return {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse}
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse;
  return proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse}
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cudosnode.cudosnode.nft.Denom;
      reader.readMessage(value,proto.cudosnode.cudosnode.nft.Denom.deserializeBinaryFromReader);
      msg.setDenom(value);
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
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenom();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cudosnode.cudosnode.nft.Denom.serializeBinaryToWriter
    );
  }
};


/**
 * optional Denom denom = 1;
 * @return {?proto.cudosnode.cudosnode.nft.Denom}
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.prototype.getDenom = function() {
  return /** @type{?proto.cudosnode.cudosnode.nft.Denom} */ (
    jspb.Message.getWrapperField(this, proto.cudosnode.cudosnode.nft.Denom, 1));
};


/**
 * @param {?proto.cudosnode.cudosnode.nft.Denom|undefined} value
 * @return {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse} returns this
*/
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.prototype.setDenom = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse} returns this
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.prototype.clearDenom = function() {
  return this.setDenom(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cudosnode.cudosnode.nft.QueryDenomBySymbolResponse.prototype.hasDenom = function() {
  return jspb.Message.getField(this, 1) != null;
};

