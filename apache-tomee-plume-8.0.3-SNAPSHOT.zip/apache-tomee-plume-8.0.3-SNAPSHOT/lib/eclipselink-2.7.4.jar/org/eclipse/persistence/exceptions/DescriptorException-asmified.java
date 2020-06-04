package asm.org.eclipse.persistence.exceptions;
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
public class DescriptorExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/exceptions/DescriptorException", null, "org/eclipse/persistence/exceptions/ValidationException", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_TRANSIENT, "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_AND_MAPPING_WITH_INDIRECTION_MISMATCH", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_AND_MAPPING_WITHOUT_INDIRECTION_MISMATCH", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_NAME_NOT_SPECIFIED", "I", null, new Integer(6));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_TYPE_NOT_VALID", "I", null, new Integer(7));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS_INDICATOR_FIELD_NOT_FOUND", "I", null, new Integer(8));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIRECT_FIELD_NAME_NOT_SET", "I", null, new Integer(9));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIELD_NAME_NOT_SET_IN_MAPPING", "I", null, new Integer(10));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOREIGN_KEYS_DEFINED_INCORRECTLY", "I", null, new Integer(11));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IDENTITY_MAP_NOT_SPECIFIED", "I", null, new Integer(12));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_GETTING_VALUE_THRU_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(13));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_CLONING", "I", null, new Integer(14));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_CONSTRUCTOR_INSTANTIATION", "I", null, new Integer(15));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_EVENT_EXECUTION", "I", null, new Integer(16));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_GETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(17));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_INSTANTIATING_METHOD_BASED_PROXY", "I", null, new Integer(18));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_INVOKING_ATTRIBUTE_METHOD", "I", null, new Integer(19));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_INVOKING_FIELD_TO_METHOD", "I", null, new Integer(20));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_INVOKING_ROW_EXTRACTION_METHOD", "I", null, new Integer(21));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_METHOD_INSTANTIATION", "I", null, new Integer(22));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_OBSOLETE_EVENT_EXECUTION", "I", null, new Integer(23));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_SETTING_VALUE_THRU_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(24));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_SETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(25));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_GETTING_VALUE_THRU_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(26));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_GETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(27));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_INSTANTIATING_METHOD_BASED_PROXY", "I", null, new Integer(28));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_INVOKING_ATTRIBUTE_METHOD", "I", null, new Integer(29));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_INVOKING_FIELD_TO_METHOD", "I", null, new Integer(30));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_OBSOLETE_EVENT_EXECUTION", "I", null, new Integer(31));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_SETTING_VALUE_THRU_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(32));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ARGUMENT_WHILE_SETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(33));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANTIATION_WHILE_CONSTRUCTOR_INSTANTIATION", "I", null, new Integer(34));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_DATA_MODIFICATION_EVENT", "I", null, new Integer(35));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_DATA_MODIFICATION_EVENT_CODE", "I", null, new Integer(36));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_DESCRIPTOR_EVENT_CODE", "I", null, new Integer(37));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_IDENTITY_MAP", "I", null, new Integer(38));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_CLASS_NOT_SPECIFIED", "I", null, new Integer(39));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESCRIPTOR_FOR_INTERFACE_IS_MISSING", "I", null, new Integer(40));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAPPING_FOR_SEQUENCE_NUMBER_FIELD", "I", null, new Integer(41));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_CLASS_FOR_INDICATOR_FIELD_VALUE", "I", null, new Integer(43));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_CLASS_INDICATOR_FIELD", "I", null, new Integer(44));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_MAPPING_FOR_FIELD", "I", null, new Integer(45));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_MAPPING_FOR_PRIMARY_KEY", "I", null, new Integer(46));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTIPLE_TABLE_PRIMARY_KEY_NOT_SPECIFIED", "I", null, new Integer(47));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTIPLE_WRITE_MAPPINGS_FOR_FIELD", "I", null, new Integer(48));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_ATTRIBUTE_TRANSFORMATION_METHOD", "I", null, new Integer(49));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_FIELD_NAME_FOR_MAPPING", "I", null, new Integer(50));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_FOREIGN_KEYS_ARE_SPECIFIED", "I", null, new Integer(51));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_REFERENCE_KEY_IS_SPECIFIED", "I", null, new Integer(52));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_RELATION_TABLE", "I", null, new Integer(53));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SOURCE_RELATION_KEYS_SPECIFIED", "I", null, new Integer(54));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_ON_FIND_OBSOLETE_METHOD", "I", null, new Integer(55));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_ON_INITIALIZING_ATTRIBUTE_METHOD", "I", null, new Integer(56));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_CONSTRUCTOR_INSTANTIATION", "I", null, new Integer(57));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_CONVERTING_TO_METHOD", "I", null, new Integer(58));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_FIELD_WHILE_INITIALIZING_ATTRIBUTES_IN_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(59));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_INITIALIZING_ATTRIBUTES_IN_METHOD_ACCESSOR", "I", null, new Integer(60));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_INITIALIZING_CLASS_EXTRACTION_METHOD", "I", null, new Integer(61));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_INITIALIZING_COPY_POLICY", "I", null, new Integer(62));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_INITIALIZING_INSTANTIATION_POLICY", "I", null, new Integer(63));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_TARGET_FOREIGN_KEYS_SPECIFIED", "I", null, new Integer(64));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_TARGET_RELATION_KEYS_SPECIFIED", "I", null, new Integer(65));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT_DESERIALIZABLE", "I", null, new Integer(66));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT_SERIALIZABLE", "I", null, new Integer(67));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_FOR_NON_NULL_AGGREGATE", "I", null, new Integer(68));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_GETTING_VALUE_THRU_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(69));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_GETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(70));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_SETTING_VALUE_THRU_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(71));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_SETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(72));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARENT_DESCRIPTOR_NOT_SPECIFIED", "I", null, new Integer(73));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PRIMARY_KEY_FIELDS_NOT_SPECIFIED", "I", null, new Integer(74));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_CLASS_NOT_SPECIFIED", "I", null, new Integer(75));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_DESCRIPTOR_IS_NOT_AGGREGATE", "I", null, new Integer(77));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_KEY_FIELD_NOT_PROPERLY_SPECIFIED", "I", null, new Integer(78));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_TABLE_NOT_SPECIFIED", "I", null, new Integer(79));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RELATION_KEY_FIELD_NOT_PROPERLY_SPECIFIED", "I", null, new Integer(80));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURN_TYPE_IN_GET_ATTRIBUTE_ACCESSOR", "I", null, new Integer(81));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_ON_FIND_METHOD", "I", null, new Integer(82));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_ON_FIND_OBSOLETE_METHOD", "I", null, new Integer(83));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_ON_INITIALIZING_ATTRIBUTE_METHOD", "I", null, new Integer(84));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_WHILE_CONVERTING_TO_METHOD", "I", null, new Integer(85));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_WHILE_INITIALIZING_ATTRIBUTES_IN_INSTANCE_VARIABLE_ACCESSOR", "I", null, new Integer(86));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_WHILE_INITIALIZING_ATTRIBUTES_IN_METHOD_ACCESSOR", "I", null, new Integer(87));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_WHILE_INITIALIZING_CLASS_EXTRACTION_METHOD", "I", null, new Integer(88));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_WHILE_INITIALIZING_COPY_POLICY", "I", null, new Integer(89));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SECURITY_WHILE_INITIALIZING_INSTANTIATION_POLICY", "I", null, new Integer(90));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SEQUENCE_NUMBER_PROPERTY_NOT_SPECIFIED", "I", null, new Integer(91));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SIZE_MISMATCH_OF_FOREIGN_KEYS", "I", null, new Integer(92));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_NOT_PRESENT", "I", null, new Integer(93));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_NOT_SPECIFIED", "I", null, new Integer(94));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_FOREIGN_KEYS_SIZE_MISMATCH", "I", null, new Integer(96));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_CLONING", "I", null, new Integer(97));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_EVENT_EXECUTION", "I", null, new Integer(98));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_GETTING_VALUE_THRU_METHOD_ACCESSOR", "I", null, new Integer(99));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_INSTANTIATING_METHOD_BASED_PROXY", "I", null, new Integer(100));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_INVOKING_ATTRIBUTE_METHOD", "I", null, new Integer(101));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_INVOKING_FIELD_TO_METHOD", "I", null, new Integer(102));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_INVOKING_ROW_EXTRACTION_METHOD", "I", null, new Integer(103));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_METHOD_INSTANTIATION", "I", null, new Integer(104));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_OBSOLETE_EVENT_EXECUTION", "I", null, new Integer(105));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_SETTING_VALUE_THRU_METHOD_ACESSOR", "I", null, new Integer(106));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_NOT_FOUND_IN_CLASS_INDICATOR_MAPPING", "I", null, new Integer(108));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRITE_LOCK_FIELD_IN_CHILD_DESCRIPTOR", "I", null, new Integer(109));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESCRIPTOR_IS_MISSING", "I", null, new Integer(110));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTIPLE_TABLE_PRIMARY_KEY_MUST_BE_FULLY_QUALIFIED", "I", null, new Integer(111));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONLY_ONE_TABLE_CAN_BE_ADDED_WITH_THIS_METHOD", "I", null, new Integer(112));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_CONSTRUCTOR_INSTANTIATION", "I", null, new Integer(113));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_METHOD_INSTANTIATION", "I", null, new Integer(114));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_ATTRBUTE_VALUE_CONVERSION_TO_FIELD_VALUE_PROVIDED", "I", null, new Integer(115));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_FIELD_VALUE_CONVERSION_TO_ATTRIBUTE_VALUE_PROVIDED", "I", null, new Integer(116));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCK_MAPPING_CANNOT_BE_READONLY", "I", null, new Integer(118));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOCK_MAPPING_MUST_BE_READONLY", "I", null, new Integer(119));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHILD_DOES_NOT_DEFINE_ABSTRACT_QUERY_KEY", "I", null, new Integer(120));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SET_EXISTENCE_CHECKING_NOT_UNDERSTOOD", "I", null, new Integer(122));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE_HOLDER_INSTANTIATION_MISMATCH", "I", null, new Integer(125));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUB_CLASS_MATCH", "I", null, new Integer(126));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURN_AND_MAPPING_WITH_INDIRECTION_MISMATCH", "I", null, new Integer(127));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURN_AND_MAPPING_WITHOUT_INDIRECTION_MISMATCH", "I", null, new Integer(128));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_AND_MAPPING_WITH_INDIRECTION_MISMATCH", "I", null, new Integer(129));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_AND_MAPPING_WITHOUT_INDIRECTION_MISMATCH", "I", null, new Integer(130));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GET_METHOD_RETURN_TYPE_NOT_VALID", "I", null, new Integer(131));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SET_METHOD_PARAMETER_TYPE_NOT_VALID", "I", null, new Integer(133));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_TABLE_NAME_IN_MULTIPLE_TABLE_FOREIGN_KEY", "I", null, new Integer(135));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_AND_MAPPING_WITH_TRANSPARENT_INDIRECTION_MISMATCH", "I", null, new Integer(138));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURN_AND_MAPPING_WITH_TRANSPARENT_INDIRECTION_MISMATCH", "I", null, new Integer(139));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMETER_AND_MAPPING_WITH_TRANSPARENT_INDIRECTION_MISMATCH", "I", null, new Integer(140));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIELD_IS_NOT_PRESENT_IN_DATABASE", "I", null, new Integer(141));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TABLE_IS_NOT_PRESENT_IN_DATABASE", "I", null, new Integer(142));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTIPLE_TABLE_INSERT_ORDER_MISMATCH", "I", null, new Integer(143));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_USE_OF_TRANSPARENT_INDIRECTION", "I", null, new Integer(144));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_INDIRECT_CONTAINER_CONSTRUCTOR", "I", null, new Integer(145));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COULD_NOT_INSTANTIATE_INDIRECT_CONTAINER_CLASS", "I", null, new Integer(146));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_CONTAINER_POLICY", "I", null, new Integer(147));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_CONTAINER_POLICY_WITH_TRANSPARENT_INDIRECTION", "I", null, new Integer(148));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_USE_OF_NO_INDIRECTION", "I", null, new Integer(149));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INDIRECT_CONTAINER_INSTANTIATION_MISMATCH", "I", null, new Integer(150));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_MAPPING_OPERATION", "I", null, new Integer(151));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_INDIRECTION_POLICY_OPERATION", "I", null, new Integer(152));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_DESCRIPTOR_IS_NOT_AGGREGATECOLLECTION", "I", null, new Integer(153));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_INDIRECTION_CONTAINER_CLASS", "I", null, new Integer(154));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_FOREIGN_KEY_TRANSLATION", "I", null, new Integer(155));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "STRUCTURE_NAME_NOT_SET_IN_MAPPING", "I", null, new Integer(156));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NORMAL_DESCRIPTORS_DO_NOT_SUPPORT_NON_RELATIONAL_EXTENSIONS", "I", null, new Integer(157));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARENT_CLASS_IS_SELF", "I", null, new Integer(158));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROXY_INDIRECTION_NOT_AVAILABLE", "I", null, new Integer(159));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_ATTRIBUTE_TYPE_FOR_PROXY_INDIRECTION", "I", null, new Integer(160));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_GET_RETURN_TYPE_FOR_PROXY_INDIRECTION", "I", null, new Integer(161));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_SET_PARAMETER_TYPE_FOR_PROXY_INDIRECTION", "I", null, new Integer(162));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INCORRECT_COLLECTION_POLICY", "I", null, new Integer(163));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_AMENDMENT_METHOD", "I", null, new Integer(164));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ERROR_OCCURED_IN_AMENDMENT_METHOD", "I", null, new Integer(165));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VARIABLE_ONE_TO_ONE_MAPPING_IS_NOT_DEFINED", "I", null, new Integer(166));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_CONSTRUCTOR_INDIRECT_COLLECTION_CLASS", "I", null, new Integer(167));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_CONSTRUCTOR_INSTANTIATION", "I", null, new Integer(168));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_CONSTRUCTOR_INSTANTIATION_OF_FACTORY", "I", null, new Integer(169));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_CONSTRUCTOR_INSTANTIATION_OF_FACTORY", "I", null, new Integer(170));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANTIATION_WHILE_CONSTRUCTOR_INSTANTIATION_OF_FACTORY", "I", null, new Integer(171));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_SUCH_METHOD_WHILE_CONSTRUCTOR_INSTANTIATION_OF_FACTORY", "I", null, new Integer(172));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_CONSTRUCTOR_INSTANTIATION_OF_FACTORY", "I", null, new Integer(173));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ILLEGAL_ACCESS_WHILE_METHOD_INSTANTIATION_OF_FACTORY", "I", null, new Integer(174));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TARGET_INVOCATION_WHILE_METHOD_INSTANTIATION_OF_FACTORY", "I", null, new Integer(175));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_METHOD_INSTANTIATION_OF_FACTORY", "I", null, new Integer(176));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_MAPPING_FOR_ATTRIBUTENAME", "I", null, new Integer(177));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_MAPPING_FOR_ATTRIBUTENAME_IN_ENTITY_BEAN", "I", null, new Integer(178));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNSUPPORTED_TYPE_FOR_BIDIRECTIONAL_RELATIONSHIP_MAINTENANCE", "I", null, new Integer(179));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFERENCE_DESCRIPTOR_CANNOT_BE_AGGREGATE", "I", null, new Integer(180));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_TRANSFORMER_CLASS_NOT_FOUND", "I", null, new Integer(181));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIELD_TRANSFORMER_CLASS_NOT_FOUND", "I", null, new Integer(182));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTRIBUTE_TRANSFORMER_CLASS_INVALID", "I", null, new Integer(183));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FIELD_TRANSFORMER_CLASS_INVALID", "I", null, new Integer(184));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_FIELD_TYPE_CONFLICT", "I", null, new Integer(185));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_FIELD_INSERT_CONFLICT", "I", null, new Integer(186));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_AND_DESCRIPTOR_FIELD_TYPE_CONFLICT", "I", null, new Integer(187));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_UNMAPPED_FIELD_TYPE_NOT_SET", "I", null, new Integer(188));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_MAPPED_FIELD_TYPE_NOT_SET", "I", null, new Integer(189));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_MAPPING_NOT_SUPPORTED", "I", null, new Integer(190));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETURNING_POLICY_FIELD_NOT_SUPPORTED", "I", null, new Integer(191));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CUSTOM_QUERY_AND_RETURNING_POLICY_CONFLICT", "I", null, new Integer(192));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_CUSTOM_QUERY_FOR_RETURNING_POLICY", "I", null, new Integer(193));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS_EXTRACTION_METHOD_MUST_BE_STATIC", "I", null, new Integer(194));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ISOLATED_DESCRIPTOR_REFERENCED_BY_SHARED_DESCRIPTOR", "I", null, new Integer(195));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPDATE_ALL_FIELDS_NOT_SET", "I", null, new Integer(196));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_MAPPING_TYPE", "I", null, new Integer(197));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEED_TO_IMPLEMENT_CHANGETRACKER", "I", null, new Integer(198));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NEED_TO_IMPLEMENT_FETCHGROUPTRACKER", "I", null, new Integer(199));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTEMPT_TO_REGISTER_DEAD_INDIRECTION", "I", null, new Integer(200));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UNIT_OF_WORK_ISOLATED_OBJECTS_ACCESSED_IN_SESSION", "I", null, new Integer(201));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERNAL_ERROR_ACCESSING_PKFIELD", "I", null, new Integer(202));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERNAL_ERROR_SET_METHOD", "I", null, new Integer(203));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_ORDER_CONFLICTS_WITH_MULTIPLE_TABLE_FOREIGN_KEYS", "I", null, new Integer(204));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_ORDER_CYCLICAL_DEPENDENCY_BETWEEN_TWO_TABLES", "I", null, new Integer(205));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_ORDER_CYCLICAL_DEPENDENCY_BETWEEN_THREE_OR_MORE_TABLES", "I", null, new Integer(206));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSERT_ORDER_CHILD_BEFORE_PARENT", "I", null, new Integer(207));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANNOT_SET_CONVERTER_FOR_NON_DIRECT_MAPPING", "I", null, new Integer(208));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIRECT_KEY_NOT_SET", "I", null, new Integer(209));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIST_ORDER_FIELD_REQUIRES_LIST", "I", null, new Integer(210));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIST_ORDER_FIELD_REQUIRES_INDIRECT_LIST", "I", null, new Integer(211));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LIST_ORDER_FIELD_TABLE_IS_WRONG", "I", null, new Integer(212));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MULTIPLE_TARGET_FOREIGN_KEY_TABLES", "I", null, new Integer(213));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ONE_TO_ONE_MAPPING_CONFLICT", "I", null, new Integer(214));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NO_RELATION_TABLE_MECHANISM", "I", null, new Integer(215));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CANNOT_USE_ID_VALUE_FOR_COMPOSITE_ID", "I", null, new Integer(216));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVALID_XPATH_FOR_DIRECT_MAPPING", "I", null, new Integer(217));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL_POINTER_WHILE_GETTING_VALUE_THRU_METHOD_ACCESSOR_IN_MODULE_ORDER_BREAKS_WEAVING", "I", null, new Integer(218));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ADDITIONAL_CRITERIA_NOT_SUPPORTED_WITH_INHERITANCE_VIEWS", "I", null, new Integer(219));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MISSING_PARTITION_POLICY", "I", null, new Integer(220));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIALIZED_OBJECT_POLICY_FIELD_NOT_SET", "I", null, new Integer(221));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EXCEPTION_ACCESSING_PRIMARY_KEY_INSTANCE", "I", null, new Integer(222));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/ValidationException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/eclipse/persistence/exceptions/DescriptorException", "java/lang/String", "org/eclipse/persistence/mappings/DatabaseMapping"}, 0, new Object[] {});
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "additionalCriteriaNotSupportedWithInheritanceViews", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 219);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 219);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attemptToRegisterDeadIndirection", "(Ljava/lang/Object;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 200);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeAndMappingWithIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeAndMappingWithoutIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeAndMappingWithTransparentIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Class;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 138);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 138);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeNameNotSpecified", "()Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeTransformerClassNotFound", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 181);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 181);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeTransformerClassInvalid", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 183);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 183);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeTypeNotValid", "(Lorg/eclipse/persistence/mappings/CollectionMapping;Ljava/lang/Class;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/CollectionMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "childDoesNotDefineAbstractQueryKeyOfParent", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 120);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "classIndicatorFieldNotFound", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "couldNotInstantiateIndirectContainerClass", "(Ljava/lang/Class;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/Helper", "getShortClassName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 146);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 146);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "descriptorForInterfaceIsMissing", "(Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "descriptorIsMissing", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 110);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "directFieldNameNotSet", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "errorAccessingSetMethodOfEntity", "(Ljava/lang/Class;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 203);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "errorOccuredInAmendmentMethod", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Exception;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 165);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 165);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fieldIsNotPresentInDatabase", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 141);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 141);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fieldNameNotSetInMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fieldTransformerClassNotFound", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 182);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 182);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fieldTransformerClassInvalid", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/foundation/AbstractTransformationMapping;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 184);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 182);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "foreignKeysDefinedIncorrectly", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMessage", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/ValidationException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/ValidationException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "cr", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getIndentationString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("MappingHeader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "cr", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getIndentationString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("DescriptorHeader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/ValidationException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "cr", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getIndentationString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("DescriptorHeader");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "getHeader", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getMethodReturnTypeNotValid", "(Lorg/eclipse/persistence/mappings/CollectionMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/CollectionMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "identityMapNotSpecified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccesstWhileGettingValueThruInstanceVaraibleAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileCloning", "(Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileConstructorInstantiation", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileConstructorInstantiationOfFactory", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 170);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 170);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileEventExecution", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileGettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileInstantiatingMethodBasedProxy", "(Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileInvokingAttributeMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileInvokingFieldToMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileInvokingRowExtractionMethod", "(Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/lang/reflect/Method;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileMethodInstantiationOfFactory", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 174);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 174);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileObsoleteEventExecute", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileSettingValueThruInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalAccessWhileSettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileGettingValueThruInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileGettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileInstantiatingMethodBasedProxy", "(Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileInvokingAttributeMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileInvokingFieldToMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileObsoleteEventExecute", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileSettingValueThruInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalArgumentWhileSettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "illegalTableNameInMultipleTableForeignKeyField", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/internal/helper/DatabaseTable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 135);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 135);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "incorrectCollectionPolicy", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Class;Ljava/lang/Class;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 163);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 163);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "indirectContainerInstantiationMismatch", "(Ljava/lang/Object;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 150);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 150);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instantiationWhileConstructorInstantiation", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "instantiationWhileConstructorInstantiationOfFactory", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 171);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 171);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidAmendmentMethod", "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Exception;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 164);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 164);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidAttributeTypeForProxyIndirection", "(Ljava/lang/Class;[Ljava/lang/Class;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuffer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 160);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 160);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidContainerPolicy", "(Lorg/eclipse/persistence/internal/queries/ContainerPolicy;Ljava/lang/Class;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 147);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 147);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidContainerPolicyWithTransparentIndirection", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/internal/queries/ContainerPolicy;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 148);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidDataModificationEvent", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidDataModificationEventCode", "(Ljava/lang/Object;Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidDescriptorEventCode", "(Lorg/eclipse/persistence/descriptors/DescriptorEvent;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/DescriptorEvent", "getEventCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidGetMethodReturnTypeForProxyIndirection", "(Ljava/lang/Class;[Ljava/lang/Class;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuffer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getGetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 161);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 161);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidIdentityMap", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidIndirectionContainerClass", "(Lorg/eclipse/persistence/internal/indirection/ContainerIndirectionPolicy;Ljava/lang/Class;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 154);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/ContainerIndirectionPolicy", "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 154);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidIndirectionPolicyOperation", "(Lorg/eclipse/persistence/internal/indirection/IndirectionPolicy;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 152);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/IndirectionPolicy", "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 152);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidMappingOperation", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 151);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidSetMethodParameterTypeForProxyIndirection", "(Ljava/lang/Class;[Ljava/lang/Class;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/StringBuffer", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ISUB);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(4, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getSetMethodName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 162);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 162);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidUseOfNoIndirection", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 149);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 149);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidUseOfTransparentIndirection", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 144);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 144);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "isolateDescriptorReferencedBySharedDescriptor", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 195);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 195);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "javaClassNotSpecified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mappingCanNotBeReadOnly", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 118);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mappingForSequenceNumberField", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingClassForIndicatorFieldValue", "(Ljava/lang/Object;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingClassIndicatorField", "(Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingClassIndicatorField", "(Lorg/eclipse/persistence/internal/oxm/record/XMLRecord;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingForeignKeyTranslation", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;Lorg/eclipse/persistence/internal/helper/DatabaseField;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 155);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 155);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingIndirectContainerConstructor", "(Ljava/lang/Class;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 145);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 145);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingMappingForField", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multipleTableInsertOrderMismatch", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getMultipleTableInsertOrder", "()Ljava/util/List;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getTables", "()Ljava/util/Vector;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 143);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 143);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multipleTablePrimaryKeyMustBeFullyQualified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 111);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multipleTablePrimaryKeyNotSpecified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multipleWriteMappingsForField", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mustBeReadOnlyMappingWhenStoredInCache", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 119);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noAttributeTransformationMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noAttributeValueConversionToFieldValueProvided", "(Ljava/lang/Object;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noConstructorIndirectionContainerClass", "(Lorg/eclipse/persistence/internal/indirection/ContainerIndirectionPolicy;Ljava/lang/Class;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 167);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/indirection/ContainerIndirectionPolicy", "getMapping", "()Lorg/eclipse/persistence/mappings/DatabaseMapping;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 167);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noFieldNameForMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noFieldValueConversionToAttributeValueProvided", "(Ljava/lang/Object;Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 116);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noForeignKeysAreSpecified", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noMappingForPrimaryKey", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noReferenceKeyIsSpecified", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noRelationTable", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "normalDescriptorsDoNotSupportNonRelationalExtensions", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 157);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 157);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSourceRelationKeysSpecified", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSubClassMatch", "(Ljava/lang/Class;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 126);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchFieldWhileInitializingAttributesInInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodOnFindObsoleteMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodOnInitializingAttributeMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileConstructorInstantiation", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileConstructorInstantiationOfFactory", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 172);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 172);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileConvertingToMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileInitializingAttributesInMethodAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileInitializingClassExtractionMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 61);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileInitializingCopyPolicy", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 62);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noSuchMethodWhileInitializingInstantiationPolicy", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noTargetForeignKeysSpecified", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 64);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noTargetRelationKeysSpecified", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "notDeserializable", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "notSerializable", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullForNonNullAggregate", "(Ljava/lang/Object;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileConstructorInstantiation", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileConstructorInstantiationOfFactory", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 173);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 173);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileGettingValueThruInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileGettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileGettingValueThruMethodAccessorCausedByWeavingNotOccurringBecauseOfModuleOrder", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 218);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 218);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 114);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileMethodInstantiationOfFactory", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 176);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 176);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileSettingValueThruInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 71);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nullPointerWhileSettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 72);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "onlyOneTableCanBeAddedWithThisMethod", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 112);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parameterAndMappingWithIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 129);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 129);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parameterAndMappingWithoutIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 130);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parameterAndMappingWithTransparentIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Class;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 140);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 140);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parentClassIsSelf", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 158);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 158);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parentDescriptorNotSpecified", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "primaryKeyFieldsNotSepcified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "proxyIndirectionNotAvailable", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 159);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 159);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "referenceClassNotSpecified", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 75);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "referenceDescriptorIsNotAggregate", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 77);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "referenceDescriptorCannotBeAggregate", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Reference descriptor cannot be aggregate.");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(SIPUSH, 180);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "referenceDescriptorIsNotAggregateCollection", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 153);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 153);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "referenceKeyFieldNotProperlySpecified", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 78);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "referenceTableNotSpecified", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 79);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "relationKeyFieldNotProperlySpecified", "(Lorg/eclipse/persistence/internal/helper/DatabaseField;Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 80);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returnAndMappingWithIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 127);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returnAndMappingWithoutIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returnAndMappingWithTransparentIndirectionMismatch", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Class;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 139);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 139);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returnTypeInGetAttributeAccessor", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityOnFindMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 82);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityOnFindObsoleteMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityOnInitializingAttributeMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 84);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityWhileConvertingToMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 85);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityWhileInitializingAttributesInInstanceVariableAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 86);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityWhileInitializingAttributesInMethodAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 87);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityWhileInitializingClassExtractionMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 88);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "classExtractionMethodMustBeStatic", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 194);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 194);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityWhileInitializingCopyPolicy", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 89);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "securityWhileInitializingInstantiationPolicy", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "sequenceNumberPropertyNotSpecified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 91);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "descriptor", "Lorg/eclipse/persistence/descriptors/ClassDescriptor;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setExistenceCheckingNotUnderstood", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 122);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/exceptions/DescriptorException", "mapping", "Lorg/eclipse/persistence/mappings/DatabaseMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getDescriptor", "()Lorg/eclipse/persistence/descriptors/ClassDescriptor;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "setMethodParameterTypeNotValid", "(Lorg/eclipse/persistence/mappings/CollectionMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/CollectionMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 133);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 133);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "sizeMismatchOfForeignKeys", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 92);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "structureNameNotSetInMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 156);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 156);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "tableIsNotPresentInDatabase", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getTableName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 142);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 142);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "tableNotPresent", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 93);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "tableNotSpecified", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetForeignKeysSizeMismatch", "(Lorg/eclipse/persistence/mappings/ForeignReferenceMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 96);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileCloning", "(Ljava/lang/Object;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 97);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileConstructorInstantiation", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 168);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 168);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileConstructorInstantiationOfFactory", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 169);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 169);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileEventExecution", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 98);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileGettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 99);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileInstantiatingMethodBasedProxy", "(Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 100);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileInvokingAttributeMethod", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 101);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileInvokingFieldToMethod", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 102);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileInvokingRowExtractionMethod", "(Lorg/eclipse/persistence/internal/sessions/AbstractRecord;Ljava/lang/reflect/Method;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(BIPUSH, 103);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileMethodInstantiation", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileMethodInstantiationOfFactory", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 175);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 175);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileObsoleteEventExecute", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 105);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "targetInvocationWhileSettingValueThruMethodAccessor", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Throwable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/exceptions/DescriptorException", "CR", "Ljava/lang/String;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setInternalException", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(BIPUSH, 106);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unsupportedTypeForBidirectionalRelationshipMaintenance", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/internal/queries/ContainerPolicy;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 179);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 179);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueHolderInstantiationMismatch", "(Ljava/lang/Object;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 125);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueNotFoundInClassIndicatorMapping", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 108);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "variableOneToOneMappingIsNotDefinedProperly", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 166);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 166);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "writeLockFieldInChildDescriptor", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 109);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "mappingForAttributeIsMissing", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 177);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 177);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "attributeMappingIsMissingForEntityBean", "(Ljava/lang/String;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 178);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 178);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyFieldTypeConflict", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 185);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 185);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyFieldInsertConflict", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 186);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 186);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyAndDescriptorFieldTypeConflict", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 187);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 187);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyUnmappedFieldTypeNotSet", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 188);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 188);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyMappedFieldTypeNotSet", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 189);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 189);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyMappingNotSupported", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 190);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 190);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "returningPolicyFieldNotSupported", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 191);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 191);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "customQueryAndReturningPolicyFieldConflict", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 192);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noCustomQueryForReturningPolicy", "(Ljava/lang/String;Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 193);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 193);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "updateAllFieldsNotSet", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 196);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 196);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidMappingType", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/mappings/DatabaseMapping", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 197);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 197);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "needToImplementChangeTracker", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/descriptors/ClassDescriptor", "getJavaClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 198);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 198);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "needToImplementFetchGroupTracker", "(Ljava/lang/Class;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 199);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 199);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "errorUsingPrimaryKey", "(Ljava/lang/Object;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 202);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 202);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "unitOfWorkIsolatedObjectsAccessedInSession", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 201);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "insertOrderConflictsWithMultipleTableForeignKeys", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/internal/helper/DatabaseTable;Lorg/eclipse/persistence/internal/helper/DatabaseTable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 204);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 204);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "insertOrderCyclicalDependencyBetweenTwoTables", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/internal/helper/DatabaseTable;Lorg/eclipse/persistence/internal/helper/DatabaseTable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 205);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 205);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "insertOrderCyclicalDependencyBetweenThreeOrMoreTables", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 206);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 206);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "insertOrderChildBeforeParent", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/internal/helper/DatabaseTable;Lorg/eclipse/persistence/internal/helper/DatabaseTable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 207);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 207);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cannotSetConverterForNonDirectMapping", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/lang/String;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 208);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 208);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "directKeyNotSet", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 209);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 209);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "listOrderFieldRequiersList", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 210);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 210);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "listOrderFieldRequiersIndirectList", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 211);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 211);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "listOrderFieldTableIsWrong", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;Lorg/eclipse/persistence/internal/helper/DatabaseTable;Lorg/eclipse/persistence/internal/helper/DatabaseTable;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 212);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 212);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "multipleTargetForeignKeyTables", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;Ljava/util/Collection;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 213);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 213);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "oneToOneMappingConflict", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 214);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 214);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "noRelationTableMechanism", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 215);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 215);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "cannotUseIdValueForCompositeId", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 216);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 216);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "invalidXpathForXMLDirectMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 217);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 217);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "missingPartitioningPolicy", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Lorg/eclipse/persistence/mappings/DatabaseMapping;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 220);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setMapping", "(Lorg/eclipse/persistence/mappings/DatabaseMapping;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Ljava/lang/Object;", "org/eclipse/persistence/exceptions/DescriptorException"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitIntInsn(SIPUSH, 220);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "serializedObjectPolicyFieldNotSet", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 221);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(SIPUSH, 221);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "exceptionAccessingPrimaryKeyInstance", "(Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/DescriptorException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/exceptions/DescriptorException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/exceptions/DescriptorException;"));
methodVisitor.visitIntInsn(SIPUSH, 222);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/i18n/ExceptionMessageGenerator", "buildMessage", "(Ljava/lang/Class;I[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/exceptions/DescriptorException", "<init>", "(Ljava/lang/String;Lorg/eclipse/persistence/descriptors/ClassDescriptor;Ljava/lang/Throwable;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(SIPUSH, 222);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/exceptions/DescriptorException", "setErrorCode", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
