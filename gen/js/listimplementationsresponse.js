// source: cosmos/base/reflection/v1beta1/reflection.proto
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

goog.provide('proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse');

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
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.repeatedFields_, null);
};
goog.inherits(proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.displayName = 'proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.repeatedFields_ = [1];



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
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    implementationMessageNamesList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f
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
 * @return {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse}
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse;
  return proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse}
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addImplementationMessageNames(value);
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
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getImplementationMessageNamesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
};


/**
 * repeated string implementation_message_names = 1;
 * @return {!Array<string>}
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.prototype.getImplementationMessageNamesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse} returns this
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.prototype.setImplementationMessageNamesList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse} returns this
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.prototype.addImplementationMessageNames = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse} returns this
 */
proto.cosmos.base.reflection.v1beta1.ListImplementationsResponse.prototype.clearImplementationMessageNamesList = function() {
  return this.setImplementationMessageNamesList([]);
};


