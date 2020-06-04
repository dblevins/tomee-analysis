package asm.org.apache.cxf.rt.security.saml.xacml;
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
public class XACMLConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/rt/security/saml/xacml/XACMLConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_TIME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:environment:current-time");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_DATE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:environment:current-date");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT_DATETIME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:environment:current-dateTime");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_DNS_NAME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:authn-locality:dns-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_IP_ADDR", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:authn-locality:ip-address");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_AUTHN_METHOD", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:authentication-method");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_AUTHN_TIME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:authentication-time");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_KEY_INFO", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:key-info");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_REQ_TIME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:request-time");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_START_TIME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:session-start-time");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_ID", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:subject-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_ID_QUALIFIER", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject:subject-id-qualifier");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_CAT_ACCESS_SUBJECT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject-category:access-subject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_CAT_CODEBASE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject-category:codebase");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_CAT_INTERMED_SUBJECT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject-category:intermediary-subject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_CAT_REC_SUBJECT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject-category:recipient-subject");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_CAT_REQ_MACHINE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:subject-category:requesting-machine");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_LOC", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:resource:resource-location");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_ID", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:resource:resource-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_WSDL_OPERATION_ID", "Ljava/lang/String;", null, "urn:cxf:apache:org:wsdl:operation-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_WSDL_SERVICE_ID", "Ljava/lang/String;", null, "urn:cxf:apache:org:wsdl:service-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_WSDL_ENDPOINT", "Ljava/lang/String;", null, "urn:cxf:apache:org:wsdl:endpoint");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_FILE_NAME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:resource:simple-file-name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_ID", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:action:action-id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ACTION_IMPLIED", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:action:implied-action");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SUBJECT_ROLE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:2.0:subject:role");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_STRING", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#string");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_BOOLEAN", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#boolean");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_INT", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#integer");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_DOUBLE", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#double");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_TIME", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#time");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_DATE", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#date");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_DATETIME", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#dateTime");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_ANY_URI", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#anyURI");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_HEX", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#hexBinary");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XS_BASE64", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema#base64Binary");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RFC_822_NAME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "X500_NAME", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:data-type:x500Name");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_STRING_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:string-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_BOOL_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:boolean-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_INT_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:integer-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DOUBLE_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:double-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATE_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:date-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_TIME_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:time-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATETIME_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:dateTime-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_ANY_URI_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:anyURI-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_X500_NAME_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:x500Name-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_RFC_822_NAME_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:rfc822Name-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_HEX_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:hexBinary-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_BASE64_EQUAL", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:base64Binary-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_INT_GT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_INT_GTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:integer-greater-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_INT_LT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:integer-less-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_INT_LTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:integer-less-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DOUBLE_GT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:double-greater-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DOUBLE_GTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:double-greater-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DOUBLE_LT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:double-less-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DOUBLE_LTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:double-less-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_STRING_GT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:string-greater-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_STRING_GTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:string-greater-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_STRING_LT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:string-less-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_STRING_LTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:string-less-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_TIME_GT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:time-greater-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_TIME_GTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:time-greater-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_TIME_LT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:time-less-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_TIME_LTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:time-less-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATETIME_GT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATETIME_GTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATETIME_LT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATETIME_LTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATE_GT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:date-greater-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATE_GTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:date-greater-than-or-equal");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATE_LT", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:date-less-than");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FUNC_DATE_LTE", "Ljava/lang/String;", null, "urn:oasis:names:tc:xacml:1.0:function:date-less-than-or-equal");
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
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
