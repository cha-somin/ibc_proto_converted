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

goog.provide('proto.provenance.metadata.v1.p8e.Contract');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.provenance.metadata.v1.p8e.Condition');
goog.require('proto.provenance.metadata.v1.p8e.Consideration');
goog.require('proto.provenance.metadata.v1.p8e.DefinitionSpec');
goog.require('proto.provenance.metadata.v1.p8e.Fact');
goog.require('proto.provenance.metadata.v1.p8e.Recital');
goog.require('proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys');
goog.require('proto.provenance.metadata.v1.p8e.Timestamp');

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
proto.provenance.metadata.v1.p8e.Contract = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.provenance.metadata.v1.p8e.Contract.repeatedFields_, null);
};
goog.inherits(proto.provenance.metadata.v1.p8e.Contract, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.provenance.metadata.v1.p8e.Contract.displayName = 'proto.provenance.metadata.v1.p8e.Contract';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.provenance.metadata.v1.p8e.Contract.repeatedFields_ = [4,5,6,7];



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
proto.provenance.metadata.v1.p8e.Contract.prototype.toObject = function(opt_includeInstance) {
  return proto.provenance.metadata.v1.p8e.Contract.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.provenance.metadata.v1.p8e.Contract} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.Contract.toObject = function(includeInstance, msg) {
  var f, obj = {
    definition: (f = msg.getDefinition()) && proto.provenance.metadata.v1.p8e.DefinitionSpec.toObject(includeInstance, f),
    spec: (f = msg.getSpec()) && proto.provenance.metadata.v1.p8e.Fact.toObject(includeInstance, f),
    invoker: (f = msg.getInvoker()) && proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys.toObject(includeInstance, f),
    inputsList: jspb.Message.toObjectList(msg.getInputsList(),
    proto.provenance.metadata.v1.p8e.Fact.toObject, includeInstance),
    conditionsList: jspb.Message.toObjectList(msg.getConditionsList(),
    proto.provenance.metadata.v1.p8e.Condition.toObject, includeInstance),
    considerationsList: jspb.Message.toObjectList(msg.getConsiderationsList(),
    proto.provenance.metadata.v1.p8e.Consideration.toObject, includeInstance),
    recitalsList: jspb.Message.toObjectList(msg.getRecitalsList(),
    proto.provenance.metadata.v1.p8e.Recital.toObject, includeInstance),
    timesExecuted: jspb.Message.getFieldWithDefault(msg, 8, 0),
    startTime: (f = msg.getStartTime()) && proto.provenance.metadata.v1.p8e.Timestamp.toObject(includeInstance, f),
    context: msg.getContext_asB64()
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
 * @return {!proto.provenance.metadata.v1.p8e.Contract}
 */
proto.provenance.metadata.v1.p8e.Contract.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.provenance.metadata.v1.p8e.Contract;
  return proto.provenance.metadata.v1.p8e.Contract.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.provenance.metadata.v1.p8e.Contract} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.provenance.metadata.v1.p8e.Contract}
 */
proto.provenance.metadata.v1.p8e.Contract.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.provenance.metadata.v1.p8e.DefinitionSpec;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.DefinitionSpec.deserializeBinaryFromReader);
      msg.setDefinition(value);
      break;
    case 2:
      var value = new proto.provenance.metadata.v1.p8e.Fact;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Fact.deserializeBinaryFromReader);
      msg.setSpec(value);
      break;
    case 3:
      var value = new proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys.deserializeBinaryFromReader);
      msg.setInvoker(value);
      break;
    case 4:
      var value = new proto.provenance.metadata.v1.p8e.Fact;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Fact.deserializeBinaryFromReader);
      msg.addInputs(value);
      break;
    case 5:
      var value = new proto.provenance.metadata.v1.p8e.Condition;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Condition.deserializeBinaryFromReader);
      msg.addConditions(value);
      break;
    case 6:
      var value = new proto.provenance.metadata.v1.p8e.Consideration;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Consideration.deserializeBinaryFromReader);
      msg.addConsiderations(value);
      break;
    case 7:
      var value = new proto.provenance.metadata.v1.p8e.Recital;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Recital.deserializeBinaryFromReader);
      msg.addRecitals(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setTimesExecuted(value);
      break;
    case 9:
      var value = new proto.provenance.metadata.v1.p8e.Timestamp;
      reader.readMessage(value,proto.provenance.metadata.v1.p8e.Timestamp.deserializeBinaryFromReader);
      msg.setStartTime(value);
      break;
    case 10:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setContext(value);
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
proto.provenance.metadata.v1.p8e.Contract.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.provenance.metadata.v1.p8e.Contract.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.provenance.metadata.v1.p8e.Contract} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.provenance.metadata.v1.p8e.Contract.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDefinition();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.provenance.metadata.v1.p8e.DefinitionSpec.serializeBinaryToWriter
    );
  }
  f = message.getSpec();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.provenance.metadata.v1.p8e.Fact.serializeBinaryToWriter
    );
  }
  f = message.getInvoker();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys.serializeBinaryToWriter
    );
  }
  f = message.getInputsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.provenance.metadata.v1.p8e.Fact.serializeBinaryToWriter
    );
  }
  f = message.getConditionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.provenance.metadata.v1.p8e.Condition.serializeBinaryToWriter
    );
  }
  f = message.getConsiderationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.provenance.metadata.v1.p8e.Consideration.serializeBinaryToWriter
    );
  }
  f = message.getRecitalsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      7,
      f,
      proto.provenance.metadata.v1.p8e.Recital.serializeBinaryToWriter
    );
  }
  f = message.getTimesExecuted();
  if (f !== 0) {
    writer.writeInt32(
      8,
      f
    );
  }
  f = message.getStartTime();
  if (f != null) {
    writer.writeMessage(
      9,
      f,
      proto.provenance.metadata.v1.p8e.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getContext_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      10,
      f
    );
  }
};


/**
 * optional DefinitionSpec definition = 1;
 * @return {?proto.provenance.metadata.v1.p8e.DefinitionSpec}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getDefinition = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.DefinitionSpec} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.DefinitionSpec, 1));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.DefinitionSpec|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setDefinition = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearDefinition = function() {
  return this.setDefinition(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.hasDefinition = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Fact spec = 2;
 * @return {?proto.provenance.metadata.v1.p8e.Fact}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getSpec = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.Fact} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.Fact, 2));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.Fact|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setSpec = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearSpec = function() {
  return this.setSpec(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.hasSpec = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional SigningAndEncryptionPublicKeys invoker = 3;
 * @return {?proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getInvoker = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys, 3));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.SigningAndEncryptionPublicKeys|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setInvoker = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearInvoker = function() {
  return this.setInvoker(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.hasInvoker = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * repeated Fact inputs = 4;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.Fact>}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getInputsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.Fact>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.Fact, 4));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.Fact>} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setInputsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.Fact=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.Fact}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.addInputs = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.provenance.metadata.v1.p8e.Fact, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearInputsList = function() {
  return this.setInputsList([]);
};


/**
 * repeated Condition conditions = 5;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.Condition>}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getConditionsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.Condition>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.Condition, 5));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.Condition>} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setConditionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.Condition=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.Condition}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.addConditions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.provenance.metadata.v1.p8e.Condition, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearConditionsList = function() {
  return this.setConditionsList([]);
};


/**
 * repeated Consideration considerations = 6;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.Consideration>}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getConsiderationsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.Consideration>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.Consideration, 6));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.Consideration>} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setConsiderationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.Consideration=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.Consideration}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.addConsiderations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.provenance.metadata.v1.p8e.Consideration, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearConsiderationsList = function() {
  return this.setConsiderationsList([]);
};


/**
 * repeated Recital recitals = 7;
 * @return {!Array<!proto.provenance.metadata.v1.p8e.Recital>}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getRecitalsList = function() {
  return /** @type{!Array<!proto.provenance.metadata.v1.p8e.Recital>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.provenance.metadata.v1.p8e.Recital, 7));
};


/**
 * @param {!Array<!proto.provenance.metadata.v1.p8e.Recital>} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setRecitalsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 7, value);
};


/**
 * @param {!proto.provenance.metadata.v1.p8e.Recital=} opt_value
 * @param {number=} opt_index
 * @return {!proto.provenance.metadata.v1.p8e.Recital}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.addRecitals = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 7, opt_value, proto.provenance.metadata.v1.p8e.Recital, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearRecitalsList = function() {
  return this.setRecitalsList([]);
};


/**
 * optional int32 times_executed = 8;
 * @return {number}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getTimesExecuted = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.setTimesExecuted = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional Timestamp start_time = 9;
 * @return {?proto.provenance.metadata.v1.p8e.Timestamp}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getStartTime = function() {
  return /** @type{?proto.provenance.metadata.v1.p8e.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.provenance.metadata.v1.p8e.Timestamp, 9));
};


/**
 * @param {?proto.provenance.metadata.v1.p8e.Timestamp|undefined} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
*/
proto.provenance.metadata.v1.p8e.Contract.prototype.setStartTime = function(value) {
  return jspb.Message.setWrapperField(this, 9, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.clearStartTime = function() {
  return this.setStartTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.hasStartTime = function() {
  return jspb.Message.getField(this, 9) != null;
};


/**
 * optional bytes context = 10;
 * @return {string}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getContext = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * optional bytes context = 10;
 * This is a type-conversion wrapper around `getContext()`
 * @return {string}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getContext_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getContext()));
};


/**
 * optional bytes context = 10;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getContext()`
 * @return {!Uint8Array}
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.getContext_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getContext()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.provenance.metadata.v1.p8e.Contract} returns this
 */
proto.provenance.metadata.v1.p8e.Contract.prototype.setContext = function(value) {
  return jspb.Message.setProto3BytesField(this, 10, value);
};


