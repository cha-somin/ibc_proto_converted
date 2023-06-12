// source: cosmos/group/v1/query.proto
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

goog.provide('proto.cosmos.group.v1.QueryTallyResultResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.group.v1.TallyResult');

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
proto.cosmos.group.v1.QueryTallyResultResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.group.v1.QueryTallyResultResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.QueryTallyResultResponse.displayName = 'proto.cosmos.group.v1.QueryTallyResultResponse';
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
proto.cosmos.group.v1.QueryTallyResultResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.QueryTallyResultResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.QueryTallyResultResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.QueryTallyResultResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    tally: (f = msg.getTally()) && proto.cosmos.group.v1.TallyResult.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.group.v1.QueryTallyResultResponse}
 */
proto.cosmos.group.v1.QueryTallyResultResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.QueryTallyResultResponse;
  return proto.cosmos.group.v1.QueryTallyResultResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.QueryTallyResultResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.QueryTallyResultResponse}
 */
proto.cosmos.group.v1.QueryTallyResultResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.group.v1.TallyResult;
      reader.readMessage(value,proto.cosmos.group.v1.TallyResult.deserializeBinaryFromReader);
      msg.setTally(value);
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
proto.cosmos.group.v1.QueryTallyResultResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.QueryTallyResultResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.QueryTallyResultResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.QueryTallyResultResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTally();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.group.v1.TallyResult.serializeBinaryToWriter
    );
  }
};


/**
 * optional TallyResult tally = 1;
 * @return {?proto.cosmos.group.v1.TallyResult}
 */
proto.cosmos.group.v1.QueryTallyResultResponse.prototype.getTally = function() {
  return /** @type{?proto.cosmos.group.v1.TallyResult} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.group.v1.TallyResult, 1));
};


/**
 * @param {?proto.cosmos.group.v1.TallyResult|undefined} value
 * @return {!proto.cosmos.group.v1.QueryTallyResultResponse} returns this
*/
proto.cosmos.group.v1.QueryTallyResultResponse.prototype.setTally = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.QueryTallyResultResponse} returns this
 */
proto.cosmos.group.v1.QueryTallyResultResponse.prototype.clearTally = function() {
  return this.setTally(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.QueryTallyResultResponse.prototype.hasTally = function() {
  return jspb.Message.getField(this, 1) != null;
};


