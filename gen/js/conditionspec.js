// source: provenance/metadata/v1/p8e/p8e.proto
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

goog.provide('proto.provenance.metadata.v1.p8e.ConditionSpec');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.p8e.DefinitionSpec');
goog.require('proto.provenance.metadata.v1.p8e.OutputSpec');

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
proto.provenance.metadata.v1.p8e.ConditionSpec = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.p8e.ConditionSpec.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.p8e.ConditionSpec, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.p8e.ConditionSpec.displayName = 'proto.provenance.metadata.v1.p8e.ConditionSpec';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.repeatedFields_ = [2];



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
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.p8e.ConditionSpec.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.p8e.ConditionSpec} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.toObject = function(includeInstance, msg) {
  var f, obj = {
    funcName: jspb.Message.getFieldWithDefault(msg, 1, ""),
    inputSpecsList: jspb.Message.toObjectList(msg.getInputSpecsList(),
    proto.provenance.metadata.v1.p8e.DefinitionSpec.toObject, includeInstance),
    outputSpec: (f = msg.getOutputSpec()) && proto.provenance.metadata.v1.p8e.OutputSpec.toObject(includeInstance, f)
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
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.p8e.ConditionSpec;
  return proto.provenance.metadata.v1.p8e.ConditionSpec.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.p8e.ConditionSpec} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setFuncName(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.p8e.DefinitionSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.DefinitionSpec.deserializeBinaryFromReader);
      msg.addInputSpecs(value);
      break;
    case 3:
      var value = new proto.provenance.metadata.v1.p8e.OutputSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.OutputSpec.deserializeBinaryFromReader);
      msg.setOutputSpec(value);
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
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.p8e.ConditionSpec.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.p8e.ConditionSpec} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getFuncName();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getInputSpecsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.provenance.metadata.v1.p8e.DefinitionSpec.serializeBinaryToWriter
    );
  }
  f = message.getOutputSpec();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.provenance.metadata.v1.p8e.OutputSpec.serializeBinaryToWriter
    );
  }
};


/**
 * optional string func_name = 1;
 * @return {string}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.getFuncName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.setFuncName = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated DefinitionSpec input_specs = 2;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.DefinitionSpec>}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.getInputSpecsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.DefinitionSpec>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.DefinitionSpec, 2));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.DefinitionSpec>} value
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec} returns this
*/
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.setInputSpecsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.DefinitionSpec=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.DefinitionSpec}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.addInputSpecs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.provenance.metadata.v1.p8e.DefinitionSpec, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.clearInputSpecsList = function() {
  return this.setInputSpecsList([]);
};


/**
 * optional OutputSpec output_spec = 3;
 * @return {?proto.provenance.metadata.v1.p8e.OutputSpec}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.getOutputSpec = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.OutputSpec} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.OutputSpec, 3));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.OutputSpec|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec} returns this
*/
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.setOutputSpec = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.ConditionSpec} returns this
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.clearOutputSpec = function() {
  return this.setOutputSpec(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.ConditionSpec.prototype.hasOutputSpec = function() {
  return jspb.Message.getField(this, 3) != null;
};


