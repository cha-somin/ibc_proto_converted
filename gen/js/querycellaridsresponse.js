// source: sommelier/cork/v2/query.proto
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

goog.provide('proto.cork.v2.QueryCellarIDsResponse');

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
proto.cork.v2.QueryCellarIDsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cork.v2.QueryCellarIDsResponse.repeatedFields_, null);
};
goog.inherits(proto.cork.v2.QueryCellarIDsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cork.v2.QueryCellarIDsResponse.displayName = 'proto.cork.v2.QueryCellarIDsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cork.v2.QueryCellarIDsResponse.repeatedFields_ = [1];



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
proto.cork.v2.QueryCellarIDsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cork.v2.QueryCellarIDsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cork.v2.QueryCellarIDsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cork.v2.QueryCellarIDsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    cellarIdsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f
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
 * @return {!proto.cork.v2.QueryCellarIDsResponse}
 */
proto.cork.v2.QueryCellarIDsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cork.v2.QueryCellarIDsResponse;
  return proto.cork.v2.QueryCellarIDsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cork.v2.QueryCellarIDsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cork.v2.QueryCellarIDsResponse}
 */
proto.cork.v2.QueryCellarIDsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addCellarIds(value);
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
proto.cork.v2.QueryCellarIDsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cork.v2.QueryCellarIDsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cork.v2.QueryCellarIDsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cork.v2.QueryCellarIDsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCellarIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
};


/**
 * repeated string cellar_ids = 1;
 * @return {!Array<string>}
 */
proto.cork.v2.QueryCellarIDsResponse.prototype.getCellarIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cork.v2.QueryCellarIDsResponse} returns this
 */
proto.cork.v2.QueryCellarIDsResponse.prototype.setCellarIdsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cork.v2.QueryCellarIDsResponse} returns this
 */
proto.cork.v2.QueryCellarIDsResponse.prototype.addCellarIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cork.v2.QueryCellarIDsResponse} returns this
 */
proto.cork.v2.QueryCellarIDsResponse.prototype.clearCellarIdsList = function() {
  return this.setCellarIdsList([]);
};


