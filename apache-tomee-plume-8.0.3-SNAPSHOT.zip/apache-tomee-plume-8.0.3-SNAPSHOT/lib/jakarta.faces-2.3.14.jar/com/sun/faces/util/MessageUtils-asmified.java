package asm.com.sun.faces.util;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class MessageUtilsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/util/MessageUtils", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION_ASSOCIATE_CTOR_WRONG_CALLSTACK_ID", "Ljava/lang/String;", null, "com.sun.faces.APPLICATION_ASSOCIATE_CTOR_WRONG_CALLSTACK");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APPLICATION_ASSOCIATE_EXISTS_ID", "Ljava/lang/String;", null, "com.sun.faces.APPLICATION_ASSOCIATE_EXISTS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERTION_FAILED_ID", "Ljava/lang/String;", null, "com.sun.faces.ASSERTION_FAILED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_NOT_SUPORTED_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ATTRIBUTE_NOT_SUPORTED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_CLOSE_INPUT_STREAM_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_CLOSE_INPUT_STREAM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_CONVERT_VALUE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_CONVERT_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_CREATE_CLASS_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_CREATE_CLASS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_CREATE_LIFECYCLE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_CREATE_LIFECYCLE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_INSTANTIATE_CLASS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_INSTANTIATE_CLASS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_INTROSPECT_CLASS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_INTROSPECT_CLASS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_LOAD_CLASS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_INSTANTIATE_CLASS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_PARSE_FILE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_PARSE_FILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANT_WRITE_ID_ATTRIBUTE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANT_WRITE_ID_ATTRIBUTE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHILD_NOT_OF_EXPECTED_TYPE_ID", "Ljava/lang/String;", null, "com.sun.faces.CHILD_NOT_OF_EXPECTED_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMAND_LINK_NO_FORM_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.COMMAND_LINK_NO_FORM_MESSAGE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_NOT_FOUND_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.COMPONENT_NOT_FOUND_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPONENT_NOT_FOUND_IN_VIEW_WARNING_ID", "Ljava/lang/String;", null, "com.sun.faces.COMPONENT_NOT_FOUND_IN_VIEW_WARNING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTENT_TYPE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.CONTENT_TYPE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONVERSION_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.TYPECONVERSION_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CYCLIC_REFERENCE_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.CYCLIC_REFERENCE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DUPLICATE_COMPONENT_ID_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.DUPLICATE_COMPONENT_ID_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EL_OUT_OF_BOUNDS_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.OUT_OF_BOUNDS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EL_PROPERTY_TYPE_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.PROPERTY_TYPE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EL_SIZE_OUT_OF_BOUNDS_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.SIZE_OUT_OF_BOUNDS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EMPTY_PARAMETER_ID", "Ljava/lang/String;", null, "com.sun.faces.EMPTY_PARAMETER");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ENCODING_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ENCODING_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_GETTING_VALUEREF_VALUE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ERROR_GETTING_VALUEREF_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_GETTING_VALUE_BINDING_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ERROR_GETTING_VALUE_BINDING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_OPENING_FILE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ERROR_OPENING_FILE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_PROCESSING_CONFIG_ID", "Ljava/lang/String;", null, "com.sun.faces.ERROR_PROCESSING_CONFIG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_REGISTERING_DTD_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ERROR_REGISTERING_DTD");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_SETTING_BEAN_PROPERTY_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ERROR_SETTING_BEAN_PROPERTY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EVAL_ATTR_UNEXPECTED_TYPE", "Ljava/lang/String;", null, "com.sun.faces.EVAL_ATTR_UNEXPECTED_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_CONTEXT_CONSTRUCTION_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.FACES_CONTEXT_CONSTRUCTION_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_MAPPING_CANNOT_BE_DETERMINED_ID", "Ljava/lang/String;", null, "com.sun.faces.FACES_SERVLET_MAPPING_CANNOT_BE_DETERMINED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_SERVLET_MAPPING_INCORRECT_ID", "Ljava/lang/String;", null, "com.sun.faces.FACES_SERVLET_MAPPING_INCORRECT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACES_CONTEXT_NOT_FOUND_ID", "Ljava/lang/String;", null, "com.sun.faces.FACES_CONTEXT_NOT_FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FILE_NOT_FOUND_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.FILE_NOT_FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ATTEMPT_SETTING_APPLICATION_ARTIFACT_ID", "Ljava/lang/String;", null, "com.sun.faces.ILLEGAL_ATTEMPT_SETTING_APPLICATION_ARTIFACT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_CHARACTERS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.ILLEGAL_CHARACTERS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_IDENTIFIER_LVALUE_MODE_ID", "Ljava/lang/String;", null, "com.sun.faces.ILLEGAL_IDENTIFIER_LVALUE_MODE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_MODEL_REFERENCE_ID", "Ljava/lang/String;", null, "com.sun.faces.ILLEGAL_MODEL_REFERENCE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_VIEW_ID_ID", "Ljava/lang/String;", null, "com.sun.faces.ILLEGAL_VIEW_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCORRECT_JSP_VERSION_ID", "Ljava/lang/String;", null, "com.sun.faces.INCORRECT_JSP_VERSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_EXPRESSION_ID", "Ljava/lang/String;", null, "com.sun.faces.INVALID_EXPRESSION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_INIT_PARAM_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.INVALID_INIT_PARAM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_MESSAGE_SEVERITY_IN_CONFIG_ID", "Ljava/lang/String;", null, "com.sun.faces.INVALID_MESSAGE_SEVERITY_IN_CONFIG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_SCOPE_LIFESPAN_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.INVALID_SCOPE_LIFESPAN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIFECYCLE_ID_ALREADY_ADDED_ID", "Ljava/lang/String;", null, "com.sun.faces.LIFECYCLE_ID_ALREADY_ADDED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIFECYCLE_ID_NOT_FOUND_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.LIFECYCLE_ID_NOT_FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_CANNOT_SET_LIST_ARRAY_PROPERTY_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_CANNOT_SET_LIST_ARRAY_PROPERTY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_EXISTING_VALUE_NOT_LIST_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_EXISTING_VALUE_NOT_LIST");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_TYPE_CONVERSION_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_TYPE_CONVERSION_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_CLASS_NOT_FOUND_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_CLASS_NOT_FOUND_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_CLASS_DEPENDENCY_NOT_FOUND_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_CLASS_DEPENDENCY_NOT_FOUND_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_CLASS_IS_NOT_PUBLIC_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_CLASS_IS_NOT_PUBLIC_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_CLASS_IS_ABSTRACT_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_CLASS_IS_ABSTRACT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_CLASS_NO_PUBLIC_NOARG_CTOR_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_CLASS_NO_PUBLIC_NOARG_CTOR_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_INJECTION_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_INJECTION_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_LIST_PROPERTY_CONFIG_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_LIST_PROPERTY_CONFIG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_AS_LIST_CONFIG_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_AS_LIST_CONFIG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_AS_MAP_CONFIG_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_AS_MAP_CONFIG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_MAP_PROPERTY_CONFIG_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_MAP_PROPERTY_CONFIG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_MAP_PROPERTY_INCORRECT_SETTER_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_MAP_PROPERTY_INCORRECT_SETTER_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_MAP_PROPERTY_INCORRECT_GETTER_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_MAP_PROPERTY_INCORRECT_GETTER_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_DEFINED_PROPERTY_CLASS_NOT_COMPATIBLE_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_DEFINED_PROPERTY_CLASS_NOT_COMPATIBLE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_INTROSPECTION_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_INTROSPECTION_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_PROPERTY_DOES_NOT_EXIST_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_PROPERTY_DOES_NOT_EXIST_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_PROPERTY_HAS_NO_SETTER_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_PROPERTY_HAS_NO_SETTER_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_PROPERTY_INCORRECT_ARGS_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_PROPERTY_INCORRECT_ARGS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_LIST_SETTER_DOES_NOT_ACCEPT_LIST_OR_ARRAY_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_LIST_SETTER_DOES_NOT_ACCEPT_LIST_OR_ARRAY_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_LIST_GETTER_DOES_NOT_RETURN_LIST_OR_ARRAY_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_LIST_SETTER_DOES_NOT_RETURN_LIST_OR_ARRAY_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_LIST_GETTER_ARRAY_NO_SETTER_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_LIST_GETTER_ARRAY_NO_SETTER_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_UNABLE_TO_SET_PROPERTY_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_UNABLE_TO_SET_PROPERTY_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_PROBLEMS_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_PROBLEMS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_PROBLEMS_STARTUP_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_PROBLEMS_STARTUP_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_UNKNOWN_PROCESSING_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_UNKNOWN_PROCESSING_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_PROPERTY_UNKNOWN_PROCESSING_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_PROPERTY_UNKNOWN_PROCESSING_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MANAGED_BEAN_INVALID_SCOPE_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.MANAGED_BEAN_INVALID_SCOPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAXIMUM_EVENTS_REACHED_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.MAXIMUM_EVENTS_REACHED");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_CLASS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.MISSING_CLASS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_RESOURCE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.MISSING_RESOURCE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODEL_UPDATE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.MODELUPDATE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAMED_OBJECT_NOT_FOUND_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NAMED_OBJECT_NOT_FOUND_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT_NESTED_IN_FACES_TAG_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NOT_NESTED_IN_FACES_TAG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT_NESTED_IN_TYPE_TAG_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NOT_NESTED_IN_TYPE_TAG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT_NESTED_IN_UICOMPONENT_TAG_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NOT_NESTED_IN_UICOMPONENT_TAG_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_DTD_FOUND_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.NO_DTD_FOUND_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_COMPONENT_ASSOCIATED_WITH_UICOMPONENT_TAG_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NO_COMPONENT_ASSOCIATED_WITH_UICOMPONENT_TAG");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_BODY_CONTENT_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_BODY_CONTENT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_COMPONENT_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_COMPONENT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_CONFIGURATION_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_CONFIGURATION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_CONTEXT_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_CONTEXT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_EVENT_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_EVENT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_FORVALUE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_FORVALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_HANDLER_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_HANDLER_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_LOCALE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_LOCALE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_MESSAGE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_MESSAGE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_PARAMETERS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_PARAMETERS_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_REQUEST_VIEW_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_REQUEST_VIEW_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_RESPONSE_STREAM_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_RESPONSE_STREAM_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_RESPONSE_VIEW_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_RESPONSE_VIEW_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_RESPONSE_WRITER_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_RESPONSE_WRITER_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_VIEW_ID_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.NULL_VIEW_ID");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT_CREATION_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.OBJECT_CREATION_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT_IS_READONLY", "Ljava/lang/String;", null, "com.sun.faces.OBJECT_IS_READONLY");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PHASE_ID_OUT_OF_BOUNDS_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.PHASE_ID_OUT_OF_BOUNDS");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RENDERER_NOT_FOUND_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.RENDERER_NOT_FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUEST_VIEW_ALREADY_SET_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.REQUEST_VIEW_ALREADY_SET_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESTORE_VIEW_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.RESTORE_VIEW_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SAVING_STATE_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.SAVING_STATE_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUPPORTS_COMPONENT_ERROR_MESSAGE_ID", "Ljava/lang/String;", null, "com.sun.faces.SUPPORTS_COMPONENT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_COMMAND_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.VALIDATION_COMMAND_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_EL_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.VALIDATION_EL_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATION_ID_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.VALIDATION_ID_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_NOT_SELECT_ITEM_ID", "Ljava/lang/String;", null, "com.sun.faces.OPTION_NOT_SELECT_ITEM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANNOT_CONVERT_ID", "Ljava/lang/String;", null, "com.sun.faces.CANNOT_CONVERT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANNOT_VALIDATE_ID", "Ljava/lang/String;", null, "com.sun.faces.CANNOT_VALIDATE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERIFIER_CLASS_NOT_FOUND_ID", "Ljava/lang/String;", null, "com.sun.faces.verifier.CLASS_NOT_FOUND");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERIFIER_CLASS_MISSING_DEP_ID", "Ljava/lang/String;", null, "com.sun.faces.verifier.CLASS_MISSING_DEP");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERIFIER_CTOR_NOT_PUBLIC_ID", "Ljava/lang/String;", null, "com.sun.faces.verifier.NON_PUBLIC_DEF_CTOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERIFIER_NO_DEF_CTOR_ID", "Ljava/lang/String;", null, "com.sun.faces.verifier.NO_DEF_CTOR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VERIFIER_WRONG_TYPE_ID", "Ljava/lang/String;", null, "com.sun.faces.verifier.WRONG_TYPE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RENDERER_CANNOT_BE_REGISTERED_ID", "Ljava/lang/String;", null, "com.sun.faces.CONFIG_RENDERER_REGISTRATION_MISSING_RENDERKIT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMAND_NOT_NESTED_WITHIN_FORM_ID", "Ljava/lang/String;", null, "com.sun.faces.COMMAND_NOT_NESTED_WITHIN_FORM");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAVIGATION_NO_MATCHING_OUTCOME_ID", "Ljava/lang/String;", null, "com.sun.faces.NAVIGATION_NO_MATCHING_OUTCOME");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAVIGATION_NO_MATCHING_OUTCOME_ACTION_ID", "Ljava/lang/String;", null, "com.sun.faces.NAVIGATION_NO_MATCHING_OUTCOME_ACTION");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NAVIGATION_INVALID_QUERY_STRING_ID", "Ljava/lang/String;", null, "com.sun.faces.NAVIGATION_INVALID_QUERY_STRING");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUTCOME_TARGET_BUTTON_NO_MATCH", "Ljava/lang/String;", null, "com.sun.faces.OUTCOME_TARGET_BUTTON_NO_MATCH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OUTCOME_TARGET_LINK_NO_MATCH", "Ljava/lang/String;", null, "com.sun.faces.OUTCOME_TARGET_LINK_NO_MATCH");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_RESOURCE_TARGET_AVAILABLE", "Ljava/lang/String;", null, "com.sun.faces.RESOURCE_TARGET_NOT_AVAILABLE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_RESOURCE_FORMAT_COLON_ERROR", "Ljava/lang/String;", null, "com.sun.faces.RESOURCE_INVALID_FORMAT_COLON_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_RESOURCE_FORMAT_NO_LIBRARY_NAME_ERROR", "Ljava/lang/String;", null, "com.sun.faces.RESOURCE_INVALID_FORMAT_NO_LIBRARY_NAME_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_RESOURCE_FORMAT_ERROR", "Ljava/lang/String;", null, "com.sun.faces.RESOURCE_INVALID_FORMAT_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ARGUMENTS_NOT_LEGAL_CC_ATTRS_EXPR", "Ljava/lang/String;", null, "com.sun.faces.ARGUMENTS_NOT_LEGAL_WITH_CC_ATTRS_EXPR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARTIAL_STATE_ERROR_RESTORING_ID", "Ljava/lang/String;", null, "com.sun.faces.partial.statesaving.ERROR_RESTORING_STATE_FOR_COMPONENT");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JS_RESOURCE_WRITING_ERROR_ID", "Ljava/lang/String;", null, "com.sun.faces.JS_RESOURCE_WRITING_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_COMPONENT_ATTRIBUTE_VALUE", "Ljava/lang/String;", null, "com.sun.faces.MISSING_COMPONENT_ATTRIBUTE_VALUE");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_COMPONENT_FACET", "Ljava/lang/String;", null, "com.sun.faces.MISSING_COMPONENT_FACET");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_COMPONENT_METADATA", "Ljava/lang/String;", null, "com.sun.faces.MISSING_COMPONENT_METADATA");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_FORM_ERROR", "Ljava/lang/String;", null, "com.sun.faces.MISSING_FORM_ERROR");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_METADATA_ERROR", "Ljava/lang/String;", null, "com.sun.faces.MISSING_METADATA_ERROR");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "getExceptionMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljavax/faces/application/FacesMessage;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageFactory", "getMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljavax/faces/application/FacesMessage;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_VARARGS, "getExceptionMessageString", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/util/MessageFactory", "getMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljavax/faces/application/FacesMessage;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/faces/application/FacesMessage", "getSummary", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "javax/faces/application/FacesMessage"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLdcInsn("null MessageFactory");
methodVisitor.visitVarInsn(ASTORE, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/text/MessageFormat", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
