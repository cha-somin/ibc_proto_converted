// source: cosmos/group/v1/types.proto
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

goog.provide('proto.cosmos.group.v1.ThresholdDecisionPolicy');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.group.v1.DecisionPolicyWindows');

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
proto.cosmos.group.v1.ThresholdDecisionPolicy = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.group.v1.ThresholdDecisionPolicy, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.ThresholdDecisionPolicy.displayName = 'proto.cosmos.group.v1.ThresholdDecisionPolicy';
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
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.ThresholdDecisionPolicy.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.ThresholdDecisionPolicy} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.toObject = function(includeInstance, msg) {
  var f, obj = {
    threshold: jspb.Message.getFieldWithDefault(msg, 1, ""),
    windows: (f = msg.getWindows()) && proto.cosmos.group.v1.DecisionPolicyWindows.toObject(includeInstance, f)
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
 * @return {!proto.cosmos.group.v1.ThresholdDecisionPolicy}
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.ThresholdDecisionPolicy;
  return proto.cosmos.group.v1.ThresholdDecisionPolicy.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.ThresholdDecisionPolicy} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.ThresholdDecisionPolicy}
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setThreshold(value);
      break;
    case 2:
      var value = new proto.cosmos.group.v1.DecisionPolicyWindows;
      reader.readMessage(value,proto.cosmos.group.v1.DecisionPolicyWindows.deserializeBinaryFromReader);
      msg.setWindows(value);
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
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.ThresholdDecisionPolicy.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.ThresholdDecisionPolicy} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getThreshold();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getWindows();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.group.v1.DecisionPolicyWindows.serializeBinaryToWriter
    );
  }
};


/**
 * optional string threshold = 1;
 * @return {string}
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.getThreshold = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.ThresholdDecisionPolicy} returns this
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.setThreshold = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional DecisionPolicyWindows windows = 2;
 * @return {?proto.cosmos.group.v1.DecisionPolicyWindows}
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.getWindows = function() {
  return /** @type{?proto.cosmos.group.v1.DecisionPolicyWindows} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.group.v1.DecisionPolicyWindows, 2));
};


/**
 * @param {?proto.cosmos.group.v1.DecisionPolicyWindows|undefined} value
 * @return {!proto.cosmos.group.v1.ThresholdDecisionPolicy} returns this
*/
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.setWindows = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cosmos.group.v1.ThresholdDecisionPolicy} returns this
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.clearWindows = function() {
  return this.setWindows(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cosmos.group.v1.ThresholdDecisionPolicy.prototype.hasWindows = function() {
  return jspb.Message.getField(this, 2) != null;
};


