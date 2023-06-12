// source: cosmos/app/v1alpha1/module.proto
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

goog.provide('proto.cosmos.app.v1alpha1.ModuleDescriptor');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.app.v1alpha1.MigrateFromInfo');
goog.require('proto.cosmos.app.v1alpha1.PackageReference');

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
proto.cosmos.app.v1alpha1.ModuleDescriptor = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.app.v1alpha1.ModuleDescriptor.repeatedFields_, null);
};
goog.inherits(proto.cosmos.app.v1alpha1.ModuleDescriptor, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.app.v1alpha1.ModuleDescriptor.displayName = 'proto.cosmos.app.v1alpha1.ModuleDescriptor';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.repeatedFields_ = [2,3];



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
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.app.v1alpha1.ModuleDescriptor.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.app.v1alpha1.ModuleDescriptor} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.toObject = function(includeInstance, msg) {
  var f, obj = {
    goImport: jspb.Message.getFieldWithDefault(msg, 1, ""),
    usePackageList: jspb.Message.toObjectList(msg.getUsePackageList(),
    proto.cosmos.app.v1alpha1.PackageReference.toObject, includeInstance),
    canMigrateFromList: jspb.Message.toObjectList(msg.getCanMigrateFromList(),
    proto.cosmos.app.v1alpha1.MigrateFromInfo.toObject, includeInstance)
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
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.app.v1alpha1.ModuleDescriptor;
  return proto.cosmos.app.v1alpha1.ModuleDescriptor.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.app.v1alpha1.ModuleDescriptor} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setGoImport(value);
      break;
    case 2:
      var value = new proto.cosmos.app.v1alpha1.PackageReference;
      reader.readMessage(value,proto.cosmos.app.v1alpha1.PackageReference.deserializeBinaryFromReader);
      msg.addUsePackage(value);
      break;
    case 3:
      var value = new proto.cosmos.app.v1alpha1.MigrateFromInfo;
      reader.readMessage(value,proto.cosmos.app.v1alpha1.MigrateFromInfo.deserializeBinaryFromReader);
      msg.addCanMigrateFrom(value);
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
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.app.v1alpha1.ModuleDescriptor.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.app.v1alpha1.ModuleDescriptor} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGoImport();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getUsePackageList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.app.v1alpha1.PackageReference.serializeBinaryToWriter
    );
  }
  f = message.getCanMigrateFromList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cosmos.app.v1alpha1.MigrateFromInfo.serializeBinaryToWriter
    );
  }
};


/**
 * optional string go_import = 1;
 * @return {string}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.getGoImport = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor} returns this
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.setGoImport = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated PackageReference use_package = 2;
 * @return {!Array<!proto.cosmos.app.v1alpha1.PackageReference>}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.getUsePackageList = function() {
  return /** @type{!Array<!proto.cosmos.app.v1alpha1.PackageReference>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.app.v1alpha1.PackageReference, 2));
};


/**
 * @param {!Array<!proto.cosmos.app.v1alpha1.PackageReference>} value
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor} returns this
*/
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.setUsePackageList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.app.v1alpha1.PackageReference=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.app.v1alpha1.PackageReference}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.addUsePackage = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.app.v1alpha1.PackageReference, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor} returns this
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.clearUsePackageList = function() {
  return this.setUsePackageList([]);
};


/**
 * repeated MigrateFromInfo can_migrate_from = 3;
 * @return {!Array<!proto.cosmos.app.v1alpha1.MigrateFromInfo>}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.getCanMigrateFromList = function() {
  return /** @type{!Array<!proto.cosmos.app.v1alpha1.MigrateFromInfo>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.app.v1alpha1.MigrateFromInfo, 3));
};


/**
 * @param {!Array<!proto.cosmos.app.v1alpha1.MigrateFromInfo>} value
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor} returns this
*/
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.setCanMigrateFromList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cosmos.app.v1alpha1.MigrateFromInfo=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.app.v1alpha1.MigrateFromInfo}
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.addCanMigrateFrom = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cosmos.app.v1alpha1.MigrateFromInfo, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.app.v1alpha1.ModuleDescriptor} returns this
 */
proto.cosmos.app.v1alpha1.ModuleDescriptor.prototype.clearCanMigrateFromList = function() {
  return this.setCanMigrateFromList([]);
};


