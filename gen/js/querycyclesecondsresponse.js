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

goog.provide('proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.rvalidator.CycleSeconds');

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
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.displayName = 'proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse';
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
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    cycleseconds: (f = msg.getCycleseconds()) && proto.stafihub.stafihub.rvalidator.CycleSeconds.toObject(includeInstance, f)
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
 * @return {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse}
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse;
  return proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse}
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.rvalidator.CycleSeconds;
      reader.readMessage(value,proto.stafihub.stafihub.rvalidator.CycleSeconds.deserializeBinaryFromReader);
      msg.setCycleseconds(value);
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
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCycleseconds();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.rvalidator.CycleSeconds.serializeBinaryToWriter
    );
  }
};


/**
 * optional CycleSeconds cycleSeconds = 1;
 * @return {?proto.stafihub.stafihub.rvalidator.CycleSeconds}
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.prototype.getCycleseconds = function() {
  return /** @type{?proto.stafihub.stafihub.rvalidator.CycleSeconds} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.rvalidator.CycleSeconds, 1));
};


/**
 * @param {?proto.stafihub.stafihub.rvalidator.CycleSeconds|undefined} value
 * @return {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse} returns this
*/
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.prototype.setCycleseconds = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse} returns this
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.prototype.clearCycleseconds = function() {
  return this.setCycleseconds(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.rvalidator.QueryCycleSecondsResponse.prototype.hasCycleseconds = function() {
  return jspb.Message.getField(this, 1) != null;
};

