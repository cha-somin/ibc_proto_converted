// source: ibc/core/channel/v1/query.proto
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

goog.provide('proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ibc.core.client.v1.Height');

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
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.repeatedFields_, null);
};
goog.inherits(proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.displayName = 'proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.repeatedFields_ = [1];



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
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    sequencesList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f,
    height: (f = msg.getHeight()) && proto.ibc.core.client.v1.Height.toObject(includeInstance, f)
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
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse}
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse;
  return proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse}
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint64() : [reader.readUint64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addSequences(values[i]);
      }
      break;
    case 2:
      var value = new proto.ibc.core.client.v1.Height;
      reader.readMessage(value,proto.ibc.core.client.v1.Height.deserializeBinaryFromReader);
      msg.setHeight(value);
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
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSequencesList();
  if (f.length > 0) {
    writer.writePackedUint64(
      1,
      f
    );
  }
  f = message.getHeight();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.ibc.core.client.v1.Height.serializeBinaryToWriter
    );
  }
};


/**
 * repeated uint64 sequences = 1;
 * @return {!Array<number>}
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.getSequencesList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} returns this
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.setSequencesList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} returns this
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.addSequences = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} returns this
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.clearSequencesList = function() {
  return this.setSequencesList([]);
};


/**
 * optional ibc.core.client.v1.Height height = 2;
 * @return {?proto.ibc.core.client.v1.Height}
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.getHeight = function() {
  return /** @type{?proto.ibc.core.client.v1.Height} */ (
    jspb.Message.getWrapperField(this, proto.ibc.core.client.v1.Height, 2));
};


/**
 * @param {?proto.ibc.core.client.v1.Height|undefined} value
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} returns this
*/
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.setHeight = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse} returns this
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.clearHeight = function() {
  return this.setHeight(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.core.channel.v1.QueryUnreceivedAcksResponse.prototype.hasHeight = function() {
  return jspb.Message.getField(this, 2) != null;
};


