// source: stafihub/rvalidator/query.proto
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

goog.provide('proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.rvalidator.Cycle');

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
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.displayName = 'proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse';
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
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    latestvotedcycle: (f = msg.getLatestvotedcycle()) && proto.stafihub.stafihub.rvalidator.Cycle.toObject(includeInstance, f)
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
 * @return {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse}
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse;
  return proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse}
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.rvalidator.Cycle;
      reader.readMessage(value,proto.stafihub.stafihub.rvalidator.Cycle.deserializeBinaryFromReader);
      msg.setLatestvotedcycle(value);
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
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLatestvotedcycle();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.rvalidator.Cycle.serializeBinaryToWriter
    );
  }
};


/**
 * optional Cycle latestVotedCycle = 1;
 * @return {?proto.stafihub.stafihub.rvalidator.Cycle}
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.prototype.getLatestvotedcycle = function() {
  return /** @type{?proto.stafihub.stafihub.rvalidator.Cycle} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.rvalidator.Cycle, 1));
};


/**
 * @param {?proto.stafihub.stafihub.rvalidator.Cycle|undefined} value
 * @return {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse} returns this
*/
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.prototype.setLatestvotedcycle = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse} returns this
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.prototype.clearLatestvotedcycle = function() {
  return this.setLatestvotedcycle(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.rvalidator.QueryLatestVotedCycleResponse.prototype.hasLatestvotedcycle = function() {
  return jspb.Message.getField(this, 1) != null;
};


