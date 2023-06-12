// source: comdex/liquidation/v1beta1/querier.proto
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

goog.provide('proto.comdex.liquidation.v1beta1.QueryAppIdsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.repeatedFields_, null);
};
goog.inherits(proto.comdex.liquidation.v1beta1.QueryAppIdsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.displayName = 'proto.comdex.liquidation.v1beta1.QueryAppIdsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.repeatedFields_ = [1];



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
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    whitelistedappidsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f
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
 * @return {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse}
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.comdex.liquidation.v1beta1.QueryAppIdsResponse;
  return proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse}
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addWhitelistedappids(values[i]);
      }
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
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getWhitelistedappidsList();
  if (f.length > 0) {
    writer.writePackedUint64(
      1,
      f
    );
  }
};


/**
 * repeated uint64 WhitelistedAppIds = 1;
 * @return {!Array<number>}
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.prototype.getWhitelistedappidsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse} returns this
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.prototype.setWhitelistedappidsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse} returns this
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.prototype.addWhitelistedappids = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.comdex.liquidation.v1beta1.QueryAppIdsResponse} returns this
 */
proto.comdex.liquidation.v1beta1.QueryAppIdsResponse.prototype.clearWhitelistedappidsList = function() {
  return this.setWhitelistedappidsList([]);
};


