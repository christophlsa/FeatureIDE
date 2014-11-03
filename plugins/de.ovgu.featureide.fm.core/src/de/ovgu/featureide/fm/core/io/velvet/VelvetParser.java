// $ANTLR 3.4 Velvet.g 2014-11-03 04:57:44

package de.ovgu.featureide.fm.core.io.velvet;

import de.ovgu.featureide.fm.core.FMCorePlugin;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class VelvetParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACT", "ACONSTR", "ATTR", "ATTR_OP_EQUALS", "ATTR_OP_GREATER", "ATTR_OP_GREATER_EQ", "ATTR_OP_LESS", "ATTR_OP_LESS_EQ", "ATTR_OP_NOT_EQUALS", "BASEEXT", "BASESPEC", "BOOLEAN", "CINTERFACE", "COLON", "COMMA", "CONCEPT", "CONSTR", "CONSTRAINT", "DEF", "EMPTY", "END_C", "END_R", "EQ", "ESC_SEQ", "EXPONENT", "FEAT", "FEATURE", "FLOAT", "GROUP", "HEX_DIGIT", "ID", "IDPath", "IMPORTINSTANCE", "IMPORTINTERFACE", "IMPORTREFERENCE", "INST", "INT", "INTF", "MANDATORY", "MINUS", "ML_COMMENT", "OCTAL_ESC", "ONEOF", "OPERAND", "OP_AND", "OP_EQUIVALENT", "OP_IMPLIES", "OP_NOT", "OP_OR", "OP_XOR", "PARAMETER", "PLUS", "REF", "SEMI", "SL_COMMENT", "SOMEOF", "START_C", "START_R", "STRING", "UNARYOP", "UNICODE_ESC", "USE", "USES", "VAR_BOOL", "VAR_FLOAT", "VAR_INT", "VAR_STRING", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACT=4;
    public static final int ACONSTR=5;
    public static final int ATTR=6;
    public static final int ATTR_OP_EQUALS=7;
    public static final int ATTR_OP_GREATER=8;
    public static final int ATTR_OP_GREATER_EQ=9;
    public static final int ATTR_OP_LESS=10;
    public static final int ATTR_OP_LESS_EQ=11;
    public static final int ATTR_OP_NOT_EQUALS=12;
    public static final int BASEEXT=13;
    public static final int BASESPEC=14;
    public static final int BOOLEAN=15;
    public static final int CINTERFACE=16;
    public static final int COLON=17;
    public static final int COMMA=18;
    public static final int CONCEPT=19;
    public static final int CONSTR=20;
    public static final int CONSTRAINT=21;
    public static final int DEF=22;
    public static final int EMPTY=23;
    public static final int END_C=24;
    public static final int END_R=25;
    public static final int EQ=26;
    public static final int ESC_SEQ=27;
    public static final int EXPONENT=28;
    public static final int FEAT=29;
    public static final int FEATURE=30;
    public static final int FLOAT=31;
    public static final int GROUP=32;
    public static final int HEX_DIGIT=33;
    public static final int ID=34;
    public static final int IDPath=35;
    public static final int IMPORTINSTANCE=36;
    public static final int IMPORTINTERFACE=37;
    public static final int IMPORTREFERENCE=38;
    public static final int INST=39;
    public static final int INT=40;
    public static final int INTF=41;
    public static final int MANDATORY=42;
    public static final int MINUS=43;
    public static final int ML_COMMENT=44;
    public static final int OCTAL_ESC=45;
    public static final int ONEOF=46;
    public static final int OPERAND=47;
    public static final int OP_AND=48;
    public static final int OP_EQUIVALENT=49;
    public static final int OP_IMPLIES=50;
    public static final int OP_NOT=51;
    public static final int OP_OR=52;
    public static final int OP_XOR=53;
    public static final int PARAMETER=54;
    public static final int PLUS=55;
    public static final int REF=56;
    public static final int SEMI=57;
    public static final int SL_COMMENT=58;
    public static final int SOMEOF=59;
    public static final int START_C=60;
    public static final int START_R=61;
    public static final int STRING=62;
    public static final int UNARYOP=63;
    public static final int UNICODE_ESC=64;
    public static final int USE=65;
    public static final int USES=66;
    public static final int VAR_BOOL=67;
    public static final int VAR_FLOAT=68;
    public static final int VAR_INT=69;
    public static final int VAR_STRING=70;
    public static final int WS=71;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public VelvetParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public VelvetParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return VelvetParser.tokenNames; }
    public String getGrammarFileName() { return "Velvet.g"; }


    @Override    
    public void emitErrorMessage(String msg) {
    	FMCorePlugin.getDefault().logError(new Exception(msg));
    }


    public static class velvetModel_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "velvetModel"
    // Velvet.g:83:1: velvetModel : ( concept | cinterface ) EOF ;
    public final VelvetParser.velvetModel_return velvetModel() throws RecognitionException {
        VelvetParser.velvetModel_return retval = new VelvetParser.velvetModel_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token EOF3=null;
        VelvetParser.concept_return concept1 =null;

        VelvetParser.cinterface_return cinterface2 =null;


        Tree EOF3_tree=null;

        try {
            // Velvet.g:84:2: ( ( concept | cinterface ) EOF )
            // Velvet.g:84:4: ( concept | cinterface ) EOF
            {
            root_0 = (Tree)adaptor.nil();


            // Velvet.g:84:4: ( concept | cinterface )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==CONCEPT) ) {
                alt1=1;
            }
            else if ( (LA1_0==CINTERFACE) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // Velvet.g:84:5: concept
                    {
                    pushFollow(FOLLOW_concept_in_velvetModel489);
                    concept1=concept();

                    state._fsp--;

                    adaptor.addChild(root_0, concept1.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:84:13: cinterface
                    {
                    pushFollow(FOLLOW_cinterface_in_velvetModel491);
                    cinterface2=cinterface();

                    state._fsp--;

                    adaptor.addChild(root_0, cinterface2.getTree());

                    }
                    break;

            }


            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_velvetModel494); 
            EOF3_tree = 
            (Tree)adaptor.create(EOF3)
            ;
            adaptor.addChild(root_0, EOF3_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "velvetModel"


    public static class concept_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "concept"
    // Velvet.g:87:1: concept : CONCEPT ID ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( parameter )? ( definitions )? ) -> ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( parameter )? ( definitions )? ) ;
    public final VelvetParser.concept_return concept() throws RecognitionException {
        VelvetParser.concept_return retval = new VelvetParser.concept_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token CONCEPT4=null;
        Token ID5=null;
        Token ATTR_OP_LESS6=null;
        Token COLON9=null;
        VelvetParser.conceptBaseSpec_return conceptBaseSpec7 =null;

        VelvetParser.definitionsSpec_return definitionsSpec8 =null;

        VelvetParser.conceptBaseExt_return conceptBaseExt10 =null;

        VelvetParser.parameter_return parameter11 =null;

        VelvetParser.definitions_return definitions12 =null;


        Tree CONCEPT4_tree=null;
        Tree ID5_tree=null;
        Tree ATTR_OP_LESS6_tree=null;
        Tree COLON9_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ATTR_OP_LESS=new RewriteRuleTokenStream(adaptor,"token ATTR_OP_LESS");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CONCEPT=new RewriteRuleTokenStream(adaptor,"token CONCEPT");
        RewriteRuleSubtreeStream stream_conceptBaseExt=new RewriteRuleSubtreeStream(adaptor,"rule conceptBaseExt");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        RewriteRuleSubtreeStream stream_conceptBaseSpec=new RewriteRuleSubtreeStream(adaptor,"rule conceptBaseSpec");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_definitionsSpec=new RewriteRuleSubtreeStream(adaptor,"rule definitionsSpec");
        try {
            // Velvet.g:88:2: ( CONCEPT ID ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( parameter )? ( definitions )? ) -> ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( parameter )? ( definitions )? ) )
            // Velvet.g:88:4: CONCEPT ID ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( parameter )? ( definitions )? )
            {
            CONCEPT4=(Token)match(input,CONCEPT,FOLLOW_CONCEPT_in_concept507);  
            stream_CONCEPT.add(CONCEPT4);


            ID5=(Token)match(input,ID,FOLLOW_ID_in_concept509);  
            stream_ID.add(ID5);


            // Velvet.g:89:3: ( ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )? | ( COLON conceptBaseExt )? ( parameter )? ( definitions )? )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ATTR_OP_LESS) ) {
                alt6=1;
            }
            else if ( (LA6_0==EOF||LA6_0==COLON||(LA6_0 >= IMPORTINSTANCE && LA6_0 <= IMPORTINTERFACE)||LA6_0==START_C) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // Velvet.g:89:4: ATTR_OP_LESS conceptBaseSpec ( definitionsSpec )?
                    {
                    ATTR_OP_LESS6=(Token)match(input,ATTR_OP_LESS,FOLLOW_ATTR_OP_LESS_in_concept516);  
                    stream_ATTR_OP_LESS.add(ATTR_OP_LESS6);


                    pushFollow(FOLLOW_conceptBaseSpec_in_concept518);
                    conceptBaseSpec7=conceptBaseSpec();

                    state._fsp--;

                    stream_conceptBaseSpec.add(conceptBaseSpec7.getTree());

                    // Velvet.g:89:33: ( definitionsSpec )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==START_C) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // Velvet.g:89:33: definitionsSpec
                            {
                            pushFollow(FOLLOW_definitionsSpec_in_concept520);
                            definitionsSpec8=definitionsSpec();

                            state._fsp--;

                            stream_definitionsSpec.add(definitionsSpec8.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Velvet.g:90:3: ( COLON conceptBaseExt )? ( parameter )? ( definitions )?
                    {
                    // Velvet.g:90:3: ( COLON conceptBaseExt )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==COLON) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // Velvet.g:90:4: COLON conceptBaseExt
                            {
                            COLON9=(Token)match(input,COLON,FOLLOW_COLON_in_concept528);  
                            stream_COLON.add(COLON9);


                            pushFollow(FOLLOW_conceptBaseExt_in_concept530);
                            conceptBaseExt10=conceptBaseExt();

                            state._fsp--;

                            stream_conceptBaseExt.add(conceptBaseExt10.getTree());

                            }
                            break;

                    }


                    // Velvet.g:90:27: ( parameter )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0 >= IMPORTINSTANCE && LA4_0 <= IMPORTINTERFACE)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Velvet.g:90:27: parameter
                            {
                            pushFollow(FOLLOW_parameter_in_concept534);
                            parameter11=parameter();

                            state._fsp--;

                            stream_parameter.add(parameter11.getTree());

                            }
                            break;

                    }


                    // Velvet.g:91:3: ( definitions )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==START_C) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // Velvet.g:91:3: definitions
                            {
                            pushFollow(FOLLOW_definitions_in_concept540);
                            definitions12=definitions();

                            state._fsp--;

                            stream_definitions.add(definitions12.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }


            // AST REWRITE
            // elements: parameter, conceptBaseExt, conceptBaseSpec, ID, CONCEPT, definitions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 92:2: -> ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( parameter )? ( definitions )? )
            {
                // Velvet.g:92:5: ^( CONCEPT ID ( conceptBaseSpec )? ( conceptBaseExt )? ( parameter )? ( definitions )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                stream_CONCEPT.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // Velvet.g:92:18: ( conceptBaseSpec )?
                if ( stream_conceptBaseSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_conceptBaseSpec.nextTree());

                }
                stream_conceptBaseSpec.reset();

                // Velvet.g:92:35: ( conceptBaseExt )?
                if ( stream_conceptBaseExt.hasNext() ) {
                    adaptor.addChild(root_1, stream_conceptBaseExt.nextTree());

                }
                stream_conceptBaseExt.reset();

                // Velvet.g:92:51: ( parameter )?
                if ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                // Velvet.g:92:62: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_1, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "concept"


    public static class parameter_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // Velvet.g:95:1: parameter : ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports ) ( referenceImports )? -> ^( PARAMETER ( instanceImports )? ( interfaceImports )? ( referenceImports )? ) ;
    public final VelvetParser.parameter_return parameter() throws RecognitionException {
        VelvetParser.parameter_return retval = new VelvetParser.parameter_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.instanceImports_return instanceImports13 =null;

        VelvetParser.interfaceImports_return interfaceImports14 =null;

        VelvetParser.interfaceImports_return interfaceImports15 =null;

        VelvetParser.instanceImports_return instanceImports16 =null;

        VelvetParser.interfaceImports_return interfaceImports17 =null;

        VelvetParser.instanceImports_return instanceImports18 =null;

        VelvetParser.referenceImports_return referenceImports19 =null;


        RewriteRuleSubtreeStream stream_referenceImports=new RewriteRuleSubtreeStream(adaptor,"rule referenceImports");
        RewriteRuleSubtreeStream stream_instanceImports=new RewriteRuleSubtreeStream(adaptor,"rule instanceImports");
        RewriteRuleSubtreeStream stream_interfaceImports=new RewriteRuleSubtreeStream(adaptor,"rule interfaceImports");
        try {
            // Velvet.g:96:2: ( ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports ) ( referenceImports )? -> ^( PARAMETER ( instanceImports )? ( interfaceImports )? ( referenceImports )? ) )
            // Velvet.g:96:4: ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports ) ( referenceImports )?
            {
            // Velvet.g:96:4: ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // Velvet.g:96:5: instanceImports interfaceImports
                    {
                    pushFollow(FOLLOW_instanceImports_in_parameter575);
                    instanceImports13=instanceImports();

                    state._fsp--;

                    stream_instanceImports.add(instanceImports13.getTree());

                    pushFollow(FOLLOW_interfaceImports_in_parameter577);
                    interfaceImports14=interfaceImports();

                    state._fsp--;

                    stream_interfaceImports.add(interfaceImports14.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:96:40: interfaceImports instanceImports
                    {
                    pushFollow(FOLLOW_interfaceImports_in_parameter581);
                    interfaceImports15=interfaceImports();

                    state._fsp--;

                    stream_interfaceImports.add(interfaceImports15.getTree());

                    pushFollow(FOLLOW_instanceImports_in_parameter583);
                    instanceImports16=instanceImports();

                    state._fsp--;

                    stream_instanceImports.add(instanceImports16.getTree());

                    }
                    break;
                case 3 :
                    // Velvet.g:96:75: interfaceImports
                    {
                    pushFollow(FOLLOW_interfaceImports_in_parameter587);
                    interfaceImports17=interfaceImports();

                    state._fsp--;

                    stream_interfaceImports.add(interfaceImports17.getTree());

                    }
                    break;
                case 4 :
                    // Velvet.g:96:94: instanceImports
                    {
                    pushFollow(FOLLOW_instanceImports_in_parameter591);
                    instanceImports18=instanceImports();

                    state._fsp--;

                    stream_instanceImports.add(instanceImports18.getTree());

                    }
                    break;

            }


            // Velvet.g:96:111: ( referenceImports )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==IMPORTREFERENCE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Velvet.g:96:111: referenceImports
                    {
                    pushFollow(FOLLOW_referenceImports_in_parameter594);
                    referenceImports19=referenceImports();

                    state._fsp--;

                    stream_referenceImports.add(referenceImports19.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: interfaceImports, referenceImports, instanceImports
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 97:2: -> ^( PARAMETER ( instanceImports )? ( interfaceImports )? ( referenceImports )? )
            {
                // Velvet.g:97:5: ^( PARAMETER ( instanceImports )? ( interfaceImports )? ( referenceImports )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(PARAMETER, "PARAMETER")
                , root_1);

                // Velvet.g:97:17: ( instanceImports )?
                if ( stream_instanceImports.hasNext() ) {
                    adaptor.addChild(root_1, stream_instanceImports.nextTree());

                }
                stream_instanceImports.reset();

                // Velvet.g:97:34: ( interfaceImports )?
                if ( stream_interfaceImports.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceImports.nextTree());

                }
                stream_interfaceImports.reset();

                // Velvet.g:97:52: ( referenceImports )?
                if ( stream_referenceImports.hasNext() ) {
                    adaptor.addChild(root_1, stream_referenceImports.nextTree());

                }
                stream_referenceImports.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class conceptBaseExt_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conceptBaseExt"
    // Velvet.g:100:1: conceptBaseExt : ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) ;
    public final VelvetParser.conceptBaseExt_return conceptBaseExt() throws RecognitionException {
        VelvetParser.conceptBaseExt_return retval = new VelvetParser.conceptBaseExt_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID20=null;
        Token COMMA21=null;
        Token ID22=null;

        Tree ID20_tree=null;
        Tree COMMA21_tree=null;
        Tree ID22_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // Velvet.g:101:2: ( ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) )
            // Velvet.g:101:4: ID ( COMMA ID )*
            {
            ID20=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseExt622);  
            stream_ID.add(ID20);


            // Velvet.g:101:7: ( COMMA ID )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==COMMA) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Velvet.g:101:8: COMMA ID
            	    {
            	    COMMA21=(Token)match(input,COMMA,FOLLOW_COMMA_in_conceptBaseExt625);  
            	    stream_COMMA.add(COMMA21);


            	    ID22=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseExt627);  
            	    stream_ID.add(ID22);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 102:2: -> ^( BASEEXT ( ID )+ )
            {
                // Velvet.g:102:5: ^( BASEEXT ( ID )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BASEEXT, "BASEEXT")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conceptBaseExt"


    public static class conceptBaseSpec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conceptBaseSpec"
    // Velvet.g:105:1: conceptBaseSpec : ID ( COMMA ID )* -> ^( BASESPEC ( ID )+ ) ;
    public final VelvetParser.conceptBaseSpec_return conceptBaseSpec() throws RecognitionException {
        VelvetParser.conceptBaseSpec_return retval = new VelvetParser.conceptBaseSpec_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID23=null;
        Token COMMA24=null;
        Token ID25=null;

        Tree ID23_tree=null;
        Tree COMMA24_tree=null;
        Tree ID25_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // Velvet.g:106:2: ( ID ( COMMA ID )* -> ^( BASESPEC ( ID )+ ) )
            // Velvet.g:106:4: ID ( COMMA ID )*
            {
            ID23=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseSpec652);  
            stream_ID.add(ID23);


            // Velvet.g:106:7: ( COMMA ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==COMMA) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Velvet.g:106:8: COMMA ID
            	    {
            	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_conceptBaseSpec655);  
            	    stream_COMMA.add(COMMA24);


            	    ID25=(Token)match(input,ID,FOLLOW_ID_in_conceptBaseSpec657);  
            	    stream_ID.add(ID25);


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 107:2: -> ^( BASESPEC ( ID )+ )
            {
                // Velvet.g:107:5: ^( BASESPEC ( ID )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BASESPEC, "BASESPEC")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "conceptBaseSpec"


    public static class instanceImports_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instanceImports"
    // Velvet.g:110:1: instanceImports : IMPORTINSTANCE ID name ( COMMA ID name )* -> ^( INST ( ID name )+ ) ;
    public final VelvetParser.instanceImports_return instanceImports() throws RecognitionException {
        VelvetParser.instanceImports_return retval = new VelvetParser.instanceImports_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token IMPORTINSTANCE26=null;
        Token ID27=null;
        Token COMMA29=null;
        Token ID30=null;
        VelvetParser.name_return name28 =null;

        VelvetParser.name_return name31 =null;


        Tree IMPORTINSTANCE26_tree=null;
        Tree ID27_tree=null;
        Tree COMMA29_tree=null;
        Tree ID30_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IMPORTINSTANCE=new RewriteRuleTokenStream(adaptor,"token IMPORTINSTANCE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:111:2: ( IMPORTINSTANCE ID name ( COMMA ID name )* -> ^( INST ( ID name )+ ) )
            // Velvet.g:111:4: IMPORTINSTANCE ID name ( COMMA ID name )*
            {
            IMPORTINSTANCE26=(Token)match(input,IMPORTINSTANCE,FOLLOW_IMPORTINSTANCE_in_instanceImports681);  
            stream_IMPORTINSTANCE.add(IMPORTINSTANCE26);


            ID27=(Token)match(input,ID,FOLLOW_ID_in_instanceImports683);  
            stream_ID.add(ID27);


            pushFollow(FOLLOW_name_in_instanceImports685);
            name28=name();

            state._fsp--;

            stream_name.add(name28.getTree());

            // Velvet.g:111:27: ( COMMA ID name )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Velvet.g:111:28: COMMA ID name
            	    {
            	    COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_instanceImports688);  
            	    stream_COMMA.add(COMMA29);


            	    ID30=(Token)match(input,ID,FOLLOW_ID_in_instanceImports690);  
            	    stream_ID.add(ID30);


            	    pushFollow(FOLLOW_name_in_instanceImports692);
            	    name31=name();

            	    state._fsp--;

            	    stream_name.add(name31.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            // AST REWRITE
            // elements: name, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 112:2: -> ^( INST ( ID name )+ )
            {
                // Velvet.g:112:5: ^( INST ( ID name )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(INST, "INST")
                , root_1);

                if ( !(stream_name.hasNext()||stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_name.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_name.reset();
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instanceImports"


    public static class interfaceImports_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceImports"
    // Velvet.g:115:1: interfaceImports : IMPORTINTERFACE ID name ( COMMA ID name )* -> ^( INTF ( ID name )+ ) ;
    public final VelvetParser.interfaceImports_return interfaceImports() throws RecognitionException {
        VelvetParser.interfaceImports_return retval = new VelvetParser.interfaceImports_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token IMPORTINTERFACE32=null;
        Token ID33=null;
        Token COMMA35=null;
        Token ID36=null;
        VelvetParser.name_return name34 =null;

        VelvetParser.name_return name37 =null;


        Tree IMPORTINTERFACE32_tree=null;
        Tree ID33_tree=null;
        Tree COMMA35_tree=null;
        Tree ID36_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_IMPORTINTERFACE=new RewriteRuleTokenStream(adaptor,"token IMPORTINTERFACE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:116:2: ( IMPORTINTERFACE ID name ( COMMA ID name )* -> ^( INTF ( ID name )+ ) )
            // Velvet.g:116:4: IMPORTINTERFACE ID name ( COMMA ID name )*
            {
            IMPORTINTERFACE32=(Token)match(input,IMPORTINTERFACE,FOLLOW_IMPORTINTERFACE_in_interfaceImports721);  
            stream_IMPORTINTERFACE.add(IMPORTINTERFACE32);


            ID33=(Token)match(input,ID,FOLLOW_ID_in_interfaceImports723);  
            stream_ID.add(ID33);


            pushFollow(FOLLOW_name_in_interfaceImports725);
            name34=name();

            state._fsp--;

            stream_name.add(name34.getTree());

            // Velvet.g:116:28: ( COMMA ID name )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Velvet.g:116:29: COMMA ID name
            	    {
            	    COMMA35=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceImports728);  
            	    stream_COMMA.add(COMMA35);


            	    ID36=(Token)match(input,ID,FOLLOW_ID_in_interfaceImports730);  
            	    stream_ID.add(ID36);


            	    pushFollow(FOLLOW_name_in_interfaceImports732);
            	    name37=name();

            	    state._fsp--;

            	    stream_name.add(name37.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 117:2: -> ^( INTF ( ID name )+ )
            {
                // Velvet.g:117:5: ^( INTF ( ID name )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(INTF, "INTF")
                , root_1);

                if ( !(stream_ID.hasNext()||stream_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_name.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_ID.reset();
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceImports"


    public static class referenceImports_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "referenceImports"
    // Velvet.g:120:1: referenceImports : IMPORTREFERENCE ID name ( COMMA ID name )* -> ^( REF ( ID name )+ ) ;
    public final VelvetParser.referenceImports_return referenceImports() throws RecognitionException {
        VelvetParser.referenceImports_return retval = new VelvetParser.referenceImports_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token IMPORTREFERENCE38=null;
        Token ID39=null;
        Token COMMA41=null;
        Token ID42=null;
        VelvetParser.name_return name40 =null;

        VelvetParser.name_return name43 =null;


        Tree IMPORTREFERENCE38_tree=null;
        Tree ID39_tree=null;
        Tree COMMA41_tree=null;
        Tree ID42_tree=null;
        RewriteRuleTokenStream stream_IMPORTREFERENCE=new RewriteRuleTokenStream(adaptor,"token IMPORTREFERENCE");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:121:2: ( IMPORTREFERENCE ID name ( COMMA ID name )* -> ^( REF ( ID name )+ ) )
            // Velvet.g:121:4: IMPORTREFERENCE ID name ( COMMA ID name )*
            {
            IMPORTREFERENCE38=(Token)match(input,IMPORTREFERENCE,FOLLOW_IMPORTREFERENCE_in_referenceImports760);  
            stream_IMPORTREFERENCE.add(IMPORTREFERENCE38);


            ID39=(Token)match(input,ID,FOLLOW_ID_in_referenceImports762);  
            stream_ID.add(ID39);


            pushFollow(FOLLOW_name_in_referenceImports764);
            name40=name();

            state._fsp--;

            stream_name.add(name40.getTree());

            // Velvet.g:121:28: ( COMMA ID name )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Velvet.g:121:30: COMMA ID name
            	    {
            	    COMMA41=(Token)match(input,COMMA,FOLLOW_COMMA_in_referenceImports768);  
            	    stream_COMMA.add(COMMA41);


            	    ID42=(Token)match(input,ID,FOLLOW_ID_in_referenceImports770);  
            	    stream_ID.add(ID42);


            	    pushFollow(FOLLOW_name_in_referenceImports772);
            	    name43=name();

            	    state._fsp--;

            	    stream_name.add(name43.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: ID, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 122:2: -> ^( REF ( ID name )+ )
            {
                // Velvet.g:122:5: ^( REF ( ID name )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(REF, "REF")
                , root_1);

                if ( !(stream_ID.hasNext()||stream_name.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext()||stream_name.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                    adaptor.addChild(root_1, stream_name.nextTree());

                }
                stream_ID.reset();
                stream_name.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "referenceImports"


    public static class cinterface_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cinterface"
    // Velvet.g:125:1: cinterface : CINTERFACE ID ( COLON interfaceBaseExt )? definitions -> ^( CINTERFACE ID ( interfaceBaseExt )? definitions ) ;
    public final VelvetParser.cinterface_return cinterface() throws RecognitionException {
        VelvetParser.cinterface_return retval = new VelvetParser.cinterface_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token CINTERFACE44=null;
        Token ID45=null;
        Token COLON46=null;
        VelvetParser.interfaceBaseExt_return interfaceBaseExt47 =null;

        VelvetParser.definitions_return definitions48 =null;


        Tree CINTERFACE44_tree=null;
        Tree ID45_tree=null;
        Tree COLON46_tree=null;
        RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_CINTERFACE=new RewriteRuleTokenStream(adaptor,"token CINTERFACE");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_interfaceBaseExt=new RewriteRuleSubtreeStream(adaptor,"rule interfaceBaseExt");
        try {
            // Velvet.g:125:12: ( CINTERFACE ID ( COLON interfaceBaseExt )? definitions -> ^( CINTERFACE ID ( interfaceBaseExt )? definitions ) )
            // Velvet.g:125:14: CINTERFACE ID ( COLON interfaceBaseExt )? definitions
            {
            CINTERFACE44=(Token)match(input,CINTERFACE,FOLLOW_CINTERFACE_in_cinterface800);  
            stream_CINTERFACE.add(CINTERFACE44);


            ID45=(Token)match(input,ID,FOLLOW_ID_in_cinterface802);  
            stream_ID.add(ID45);


            // Velvet.g:125:29: ( COLON interfaceBaseExt )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLON) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // Velvet.g:125:30: COLON interfaceBaseExt
                    {
                    COLON46=(Token)match(input,COLON,FOLLOW_COLON_in_cinterface806);  
                    stream_COLON.add(COLON46);


                    pushFollow(FOLLOW_interfaceBaseExt_in_cinterface808);
                    interfaceBaseExt47=interfaceBaseExt();

                    state._fsp--;

                    stream_interfaceBaseExt.add(interfaceBaseExt47.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_definitions_in_cinterface812);
            definitions48=definitions();

            state._fsp--;

            stream_definitions.add(definitions48.getTree());

            // AST REWRITE
            // elements: interfaceBaseExt, CINTERFACE, ID, definitions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 126:2: -> ^( CINTERFACE ID ( interfaceBaseExt )? definitions )
            {
                // Velvet.g:126:5: ^( CINTERFACE ID ( interfaceBaseExt )? definitions )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                stream_CINTERFACE.nextNode()
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // Velvet.g:126:21: ( interfaceBaseExt )?
                if ( stream_interfaceBaseExt.hasNext() ) {
                    adaptor.addChild(root_1, stream_interfaceBaseExt.nextTree());

                }
                stream_interfaceBaseExt.reset();

                adaptor.addChild(root_1, stream_definitions.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cinterface"


    public static class interfaceBaseExt_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "interfaceBaseExt"
    // Velvet.g:129:1: interfaceBaseExt : ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) ;
    public final VelvetParser.interfaceBaseExt_return interfaceBaseExt() throws RecognitionException {
        VelvetParser.interfaceBaseExt_return retval = new VelvetParser.interfaceBaseExt_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token ID49=null;
        Token COMMA50=null;
        Token ID51=null;

        Tree ID49_tree=null;
        Tree COMMA50_tree=null;
        Tree ID51_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");

        try {
            // Velvet.g:130:2: ( ID ( COMMA ID )* -> ^( BASEEXT ( ID )+ ) )
            // Velvet.g:130:4: ID ( COMMA ID )*
            {
            ID49=(Token)match(input,ID,FOLLOW_ID_in_interfaceBaseExt839);  
            stream_ID.add(ID49);


            // Velvet.g:130:7: ( COMMA ID )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Velvet.g:130:8: COMMA ID
            	    {
            	    COMMA50=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceBaseExt842);  
            	    stream_COMMA.add(COMMA50);


            	    ID51=(Token)match(input,ID,FOLLOW_ID_in_interfaceBaseExt844);  
            	    stream_ID.add(ID51);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 131:2: -> ^( BASEEXT ( ID )+ )
            {
                // Velvet.g:131:5: ^( BASEEXT ( ID )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(BASEEXT, "BASEEXT")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "interfaceBaseExt"


    public static class name_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "name"
    // Velvet.g:134:1: name : ( ID | IDPath );
    public final VelvetParser.name_return name() throws RecognitionException {
        VelvetParser.name_return retval = new VelvetParser.name_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set52=null;

        Tree set52_tree=null;

        try {
            // Velvet.g:134:5: ( ID | IDPath )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set52=(Token)input.LT(1);

            if ( (input.LA(1) >= ID && input.LA(1) <= IDPath) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set52)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "name"


    public static class definitions_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitions"
    // Velvet.g:138:1: definitions : START_C definition END_C -> ^( DEF ( definition )? EMPTY ) ;
    public final VelvetParser.definitions_return definitions() throws RecognitionException {
        VelvetParser.definitions_return retval = new VelvetParser.definitions_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_C53=null;
        Token END_C55=null;
        VelvetParser.definition_return definition54 =null;


        Tree START_C53_tree=null;
        Tree END_C55_tree=null;
        RewriteRuleTokenStream stream_END_C=new RewriteRuleTokenStream(adaptor,"token END_C");
        RewriteRuleTokenStream stream_START_C=new RewriteRuleTokenStream(adaptor,"token START_C");
        RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");
        try {
            // Velvet.g:139:2: ( START_C definition END_C -> ^( DEF ( definition )? EMPTY ) )
            // Velvet.g:139:4: START_C definition END_C
            {
            START_C53=(Token)match(input,START_C,FOLLOW_START_C_in_definitions884);  
            stream_START_C.add(START_C53);


            pushFollow(FOLLOW_definition_in_definitions886);
            definition54=definition();

            state._fsp--;

            stream_definition.add(definition54.getTree());

            END_C55=(Token)match(input,END_C,FOLLOW_END_C_in_definitions888);  
            stream_END_C.add(END_C55);


            // AST REWRITE
            // elements: definition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 140:2: -> ^( DEF ( definition )? EMPTY )
            {
                // Velvet.g:140:5: ^( DEF ( definition )? EMPTY )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(DEF, "DEF")
                , root_1);

                // Velvet.g:140:11: ( definition )?
                if ( stream_definition.hasNext() ) {
                    adaptor.addChild(root_1, stream_definition.nextTree());

                }
                stream_definition.reset();

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(EMPTY, "EMPTY")
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definitions"


    public static class definitionsSpec_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitionsSpec"
    // Velvet.g:143:1: definitionsSpec : START_C ( constraint )+ END_C -> ^( DEF ( constraint )+ EMPTY ) ;
    public final VelvetParser.definitionsSpec_return definitionsSpec() throws RecognitionException {
        VelvetParser.definitionsSpec_return retval = new VelvetParser.definitionsSpec_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_C56=null;
        Token END_C58=null;
        VelvetParser.constraint_return constraint57 =null;


        Tree START_C56_tree=null;
        Tree END_C58_tree=null;
        RewriteRuleTokenStream stream_END_C=new RewriteRuleTokenStream(adaptor,"token END_C");
        RewriteRuleTokenStream stream_START_C=new RewriteRuleTokenStream(adaptor,"token START_C");
        RewriteRuleSubtreeStream stream_constraint=new RewriteRuleSubtreeStream(adaptor,"rule constraint");
        try {
            // Velvet.g:144:2: ( START_C ( constraint )+ END_C -> ^( DEF ( constraint )+ EMPTY ) )
            // Velvet.g:144:4: START_C ( constraint )+ END_C
            {
            START_C56=(Token)match(input,START_C,FOLLOW_START_C_in_definitionsSpec911);  
            stream_START_C.add(START_C56);


            // Velvet.g:144:12: ( constraint )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==CONSTRAINT) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // Velvet.g:144:12: constraint
            	    {
            	    pushFollow(FOLLOW_constraint_in_definitionsSpec913);
            	    constraint57=constraint();

            	    state._fsp--;

            	    stream_constraint.add(constraint57.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            END_C58=(Token)match(input,END_C,FOLLOW_END_C_in_definitionsSpec916);  
            stream_END_C.add(END_C58);


            // AST REWRITE
            // elements: constraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 145:2: -> ^( DEF ( constraint )+ EMPTY )
            {
                // Velvet.g:145:5: ^( DEF ( constraint )+ EMPTY )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(DEF, "DEF")
                , root_1);

                if ( !(stream_constraint.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constraint.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraint.nextTree());

                }
                stream_constraint.reset();

                adaptor.addChild(root_1, 
                (Tree)adaptor.create(EMPTY, "EMPTY")
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definitionsSpec"


    public static class definition_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definition"
    // Velvet.g:148:1: definition : ( nonFeatureDefinition )* ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )? ;
    public final VelvetParser.definition_return definition() throws RecognitionException {
        VelvetParser.definition_return retval = new VelvetParser.definition_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.nonFeatureDefinition_return nonFeatureDefinition59 =null;

        VelvetParser.featureGroup_return featureGroup60 =null;

        VelvetParser.nonFeatureDefinition_return nonFeatureDefinition61 =null;

        VelvetParser.feature_return feature62 =null;

        VelvetParser.feature_return feature63 =null;

        VelvetParser.nonFeatureDefinition_return nonFeatureDefinition64 =null;



        try {
            // Velvet.g:149:2: ( ( nonFeatureDefinition )* ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )? )
            // Velvet.g:149:4: ( nonFeatureDefinition )* ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )?
            {
            root_0 = (Tree)adaptor.nil();


            // Velvet.g:149:4: ( nonFeatureDefinition )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==CONSTRAINT||LA17_0==USE||(LA17_0 >= VAR_BOOL && LA17_0 <= VAR_STRING)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // Velvet.g:149:4: nonFeatureDefinition
            	    {
            	    pushFollow(FOLLOW_nonFeatureDefinition_in_definition940);
            	    nonFeatureDefinition59=nonFeatureDefinition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, nonFeatureDefinition59.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            // Velvet.g:149:26: ( ( featureGroup ( nonFeatureDefinition )* ) | ( feature ( feature | nonFeatureDefinition )* ) )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ONEOF||LA20_0==SOMEOF) ) {
                alt20=1;
            }
            else if ( (LA20_0==ABSTRACT||LA20_0==FEATURE||LA20_0==MANDATORY) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // Velvet.g:150:3: ( featureGroup ( nonFeatureDefinition )* )
                    {
                    // Velvet.g:150:3: ( featureGroup ( nonFeatureDefinition )* )
                    // Velvet.g:150:4: featureGroup ( nonFeatureDefinition )*
                    {
                    pushFollow(FOLLOW_featureGroup_in_definition948);
                    featureGroup60=featureGroup();

                    state._fsp--;

                    adaptor.addChild(root_0, featureGroup60.getTree());

                    // Velvet.g:150:17: ( nonFeatureDefinition )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==CONSTRAINT||LA18_0==USE||(LA18_0 >= VAR_BOOL && LA18_0 <= VAR_STRING)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // Velvet.g:150:17: nonFeatureDefinition
                    	    {
                    	    pushFollow(FOLLOW_nonFeatureDefinition_in_definition950);
                    	    nonFeatureDefinition61=nonFeatureDefinition();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, nonFeatureDefinition61.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // Velvet.g:151:3: ( feature ( feature | nonFeatureDefinition )* )
                    {
                    // Velvet.g:151:3: ( feature ( feature | nonFeatureDefinition )* )
                    // Velvet.g:151:4: feature ( feature | nonFeatureDefinition )*
                    {
                    pushFollow(FOLLOW_feature_in_definition959);
                    feature62=feature();

                    state._fsp--;

                    adaptor.addChild(root_0, feature62.getTree());

                    // Velvet.g:151:12: ( feature | nonFeatureDefinition )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==ABSTRACT||LA19_0==FEATURE||LA19_0==MANDATORY) ) {
                            alt19=1;
                        }
                        else if ( (LA19_0==CONSTRAINT||LA19_0==USE||(LA19_0 >= VAR_BOOL && LA19_0 <= VAR_STRING)) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // Velvet.g:151:13: feature
                    	    {
                    	    pushFollow(FOLLOW_feature_in_definition962);
                    	    feature63=feature();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, feature63.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // Velvet.g:151:23: nonFeatureDefinition
                    	    {
                    	    pushFollow(FOLLOW_nonFeatureDefinition_in_definition966);
                    	    nonFeatureDefinition64=nonFeatureDefinition();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, nonFeatureDefinition64.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definition"


    public static class nonFeatureDefinition_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "nonFeatureDefinition"
    // Velvet.g:155:1: nonFeatureDefinition : ( constraint | use | attribute );
    public final VelvetParser.nonFeatureDefinition_return nonFeatureDefinition() throws RecognitionException {
        VelvetParser.nonFeatureDefinition_return retval = new VelvetParser.nonFeatureDefinition_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.constraint_return constraint65 =null;

        VelvetParser.use_return use66 =null;

        VelvetParser.attribute_return attribute67 =null;



        try {
            // Velvet.g:156:2: ( constraint | use | attribute )
            int alt21=3;
            switch ( input.LA(1) ) {
            case CONSTRAINT:
                {
                alt21=1;
                }
                break;
            case USE:
                {
                alt21=2;
                }
                break;
            case VAR_BOOL:
            case VAR_FLOAT:
            case VAR_INT:
            case VAR_STRING:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // Velvet.g:156:4: constraint
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_constraint_in_nonFeatureDefinition988);
                    constraint65=constraint();

                    state._fsp--;

                    adaptor.addChild(root_0, constraint65.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:157:4: use
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_use_in_nonFeatureDefinition993);
                    use66=use();

                    state._fsp--;

                    adaptor.addChild(root_0, use66.getTree());

                    }
                    break;
                case 3 :
                    // Velvet.g:158:4: attribute
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_attribute_in_nonFeatureDefinition998);
                    attribute67=attribute();

                    state._fsp--;

                    adaptor.addChild(root_0, attribute67.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "nonFeatureDefinition"


    public static class use_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "use"
    // Velvet.g:161:1: use : USE name SEMI -> ^( USES name ) ;
    public final VelvetParser.use_return use() throws RecognitionException {
        VelvetParser.use_return retval = new VelvetParser.use_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token USE68=null;
        Token SEMI70=null;
        VelvetParser.name_return name69 =null;


        Tree USE68_tree=null;
        Tree SEMI70_tree=null;
        RewriteRuleTokenStream stream_USE=new RewriteRuleTokenStream(adaptor,"token USE");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Velvet.g:161:5: ( USE name SEMI -> ^( USES name ) )
            // Velvet.g:161:7: USE name SEMI
            {
            USE68=(Token)match(input,USE,FOLLOW_USE_in_use1010);  
            stream_USE.add(USE68);


            pushFollow(FOLLOW_name_in_use1012);
            name69=name();

            state._fsp--;

            stream_name.add(name69.getTree());

            SEMI70=(Token)match(input,SEMI,FOLLOW_SEMI_in_use1014);  
            stream_SEMI.add(SEMI70);


            // AST REWRITE
            // elements: name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 162:2: -> ^( USES name )
            {
                // Velvet.g:162:5: ^( USES name )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(USES, "USES")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "use"


    public static class feature_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "feature"
    // Velvet.g:165:1: feature : ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )? FEATURE name ( definitions | SEMI ) -> ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? ) ;
    public final VelvetParser.feature_return feature() throws RecognitionException {
        VelvetParser.feature_return retval = new VelvetParser.feature_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token MANDATORY71=null;
        Token ABSTRACT72=null;
        Token ABSTRACT73=null;
        Token MANDATORY74=null;
        Token MANDATORY75=null;
        Token ABSTRACT76=null;
        Token FEATURE77=null;
        Token SEMI80=null;
        VelvetParser.name_return name78 =null;

        VelvetParser.definitions_return definitions79 =null;


        Tree MANDATORY71_tree=null;
        Tree ABSTRACT72_tree=null;
        Tree ABSTRACT73_tree=null;
        Tree MANDATORY74_tree=null;
        Tree MANDATORY75_tree=null;
        Tree ABSTRACT76_tree=null;
        Tree FEATURE77_tree=null;
        Tree SEMI80_tree=null;
        RewriteRuleTokenStream stream_ABSTRACT=new RewriteRuleTokenStream(adaptor,"token ABSTRACT");
        RewriteRuleTokenStream stream_MANDATORY=new RewriteRuleTokenStream(adaptor,"token MANDATORY");
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleTokenStream stream_FEATURE=new RewriteRuleTokenStream(adaptor,"token FEATURE");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        try {
            // Velvet.g:166:2: ( ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )? FEATURE name ( definitions | SEMI ) -> ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? ) )
            // Velvet.g:166:4: ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )? FEATURE name ( definitions | SEMI )
            {
            // Velvet.g:166:4: ( MANDATORY ABSTRACT | ABSTRACT MANDATORY | MANDATORY | ABSTRACT )?
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==MANDATORY) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==ABSTRACT) ) {
                    alt22=1;
                }
                else if ( (LA22_1==FEATURE) ) {
                    alt22=3;
                }
            }
            else if ( (LA22_0==ABSTRACT) ) {
                int LA22_2 = input.LA(2);

                if ( (LA22_2==MANDATORY) ) {
                    alt22=2;
                }
                else if ( (LA22_2==FEATURE) ) {
                    alt22=4;
                }
            }
            switch (alt22) {
                case 1 :
                    // Velvet.g:166:5: MANDATORY ABSTRACT
                    {
                    MANDATORY71=(Token)match(input,MANDATORY,FOLLOW_MANDATORY_in_feature1035);  
                    stream_MANDATORY.add(MANDATORY71);


                    ABSTRACT72=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_feature1037);  
                    stream_ABSTRACT.add(ABSTRACT72);


                    }
                    break;
                case 2 :
                    // Velvet.g:166:26: ABSTRACT MANDATORY
                    {
                    ABSTRACT73=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_feature1041);  
                    stream_ABSTRACT.add(ABSTRACT73);


                    MANDATORY74=(Token)match(input,MANDATORY,FOLLOW_MANDATORY_in_feature1043);  
                    stream_MANDATORY.add(MANDATORY74);


                    }
                    break;
                case 3 :
                    // Velvet.g:166:47: MANDATORY
                    {
                    MANDATORY75=(Token)match(input,MANDATORY,FOLLOW_MANDATORY_in_feature1047);  
                    stream_MANDATORY.add(MANDATORY75);


                    }
                    break;
                case 4 :
                    // Velvet.g:166:59: ABSTRACT
                    {
                    ABSTRACT76=(Token)match(input,ABSTRACT,FOLLOW_ABSTRACT_in_feature1051);  
                    stream_ABSTRACT.add(ABSTRACT76);


                    }
                    break;

            }


            FEATURE77=(Token)match(input,FEATURE,FOLLOW_FEATURE_in_feature1058);  
            stream_FEATURE.add(FEATURE77);


            pushFollow(FOLLOW_name_in_feature1060);
            name78=name();

            state._fsp--;

            stream_name.add(name78.getTree());

            // Velvet.g:167:17: ( definitions | SEMI )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==START_C) ) {
                alt23=1;
            }
            else if ( (LA23_0==SEMI) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // Velvet.g:167:18: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_feature1063);
                    definitions79=definitions();

                    state._fsp--;

                    stream_definitions.add(definitions79.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:167:32: SEMI
                    {
                    SEMI80=(Token)match(input,SEMI,FOLLOW_SEMI_in_feature1067);  
                    stream_SEMI.add(SEMI80);


                    }
                    break;

            }


            // AST REWRITE
            // elements: definitions, ABSTRACT, MANDATORY, name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 168:2: -> ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? )
            {
                // Velvet.g:168:5: ^( FEAT name ( MANDATORY )? ( ABSTRACT )? ( definitions )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(FEAT, "FEAT")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                // Velvet.g:168:17: ( MANDATORY )?
                if ( stream_MANDATORY.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_MANDATORY.nextNode()
                    );

                }
                stream_MANDATORY.reset();

                // Velvet.g:168:28: ( ABSTRACT )?
                if ( stream_ABSTRACT.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ABSTRACT.nextNode()
                    );

                }
                stream_ABSTRACT.reset();

                // Velvet.g:168:38: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_1, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "feature"


    public static class featureGroup_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "featureGroup"
    // Velvet.g:171:1: featureGroup : groupType START_C ( feature )+ END_C -> ^( GROUP groupType ( feature )+ ) ;
    public final VelvetParser.featureGroup_return featureGroup() throws RecognitionException {
        VelvetParser.featureGroup_return retval = new VelvetParser.featureGroup_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_C82=null;
        Token END_C84=null;
        VelvetParser.groupType_return groupType81 =null;

        VelvetParser.feature_return feature83 =null;


        Tree START_C82_tree=null;
        Tree END_C84_tree=null;
        RewriteRuleTokenStream stream_END_C=new RewriteRuleTokenStream(adaptor,"token END_C");
        RewriteRuleTokenStream stream_START_C=new RewriteRuleTokenStream(adaptor,"token START_C");
        RewriteRuleSubtreeStream stream_groupType=new RewriteRuleSubtreeStream(adaptor,"rule groupType");
        RewriteRuleSubtreeStream stream_feature=new RewriteRuleSubtreeStream(adaptor,"rule feature");
        try {
            // Velvet.g:172:2: ( groupType START_C ( feature )+ END_C -> ^( GROUP groupType ( feature )+ ) )
            // Velvet.g:172:4: groupType START_C ( feature )+ END_C
            {
            pushFollow(FOLLOW_groupType_in_featureGroup1098);
            groupType81=groupType();

            state._fsp--;

            stream_groupType.add(groupType81.getTree());

            START_C82=(Token)match(input,START_C,FOLLOW_START_C_in_featureGroup1100);  
            stream_START_C.add(START_C82);


            // Velvet.g:172:22: ( feature )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ABSTRACT||LA24_0==FEATURE||LA24_0==MANDATORY) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Velvet.g:172:22: feature
            	    {
            	    pushFollow(FOLLOW_feature_in_featureGroup1102);
            	    feature83=feature();

            	    state._fsp--;

            	    stream_feature.add(feature83.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            END_C84=(Token)match(input,END_C,FOLLOW_END_C_in_featureGroup1105);  
            stream_END_C.add(END_C84);


            // AST REWRITE
            // elements: feature, groupType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 173:2: -> ^( GROUP groupType ( feature )+ )
            {
                // Velvet.g:173:5: ^( GROUP groupType ( feature )+ )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(GROUP, "GROUP")
                , root_1);

                adaptor.addChild(root_1, stream_groupType.nextTree());

                if ( !(stream_feature.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_feature.hasNext() ) {
                    adaptor.addChild(root_1, stream_feature.nextTree());

                }
                stream_feature.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "featureGroup"


    public static class groupType_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupType"
    // Velvet.g:176:1: groupType : ( SOMEOF | ONEOF );
    public final VelvetParser.groupType_return groupType() throws RecognitionException {
        VelvetParser.groupType_return retval = new VelvetParser.groupType_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set85=null;

        Tree set85_tree=null;

        try {
            // Velvet.g:177:2: ( SOMEOF | ONEOF )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set85=(Token)input.LT(1);

            if ( input.LA(1)==ONEOF||input.LA(1)==SOMEOF ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set85)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupType"


    public static class constraint_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraint"
    // Velvet.g:181:1: constraint : CONSTRAINT ^ ( ID EQ !)? ( constraintDefinition | attributeConstraint ) SEMI !;
    public final VelvetParser.constraint_return constraint() throws RecognitionException {
        VelvetParser.constraint_return retval = new VelvetParser.constraint_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token CONSTRAINT86=null;
        Token ID87=null;
        Token EQ88=null;
        Token SEMI91=null;
        VelvetParser.constraintDefinition_return constraintDefinition89 =null;

        VelvetParser.attributeConstraint_return attributeConstraint90 =null;


        Tree CONSTRAINT86_tree=null;
        Tree ID87_tree=null;
        Tree EQ88_tree=null;
        Tree SEMI91_tree=null;

        try {
            // Velvet.g:182:2: ( CONSTRAINT ^ ( ID EQ !)? ( constraintDefinition | attributeConstraint ) SEMI !)
            // Velvet.g:182:4: CONSTRAINT ^ ( ID EQ !)? ( constraintDefinition | attributeConstraint ) SEMI !
            {
            root_0 = (Tree)adaptor.nil();


            CONSTRAINT86=(Token)match(input,CONSTRAINT,FOLLOW_CONSTRAINT_in_constraint1146); 
            CONSTRAINT86_tree = 
            (Tree)adaptor.create(CONSTRAINT86)
            ;
            root_0 = (Tree)adaptor.becomeRoot(CONSTRAINT86_tree, root_0);


            // Velvet.g:182:16: ( ID EQ !)?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==EQ) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // Velvet.g:182:17: ID EQ !
                    {
                    ID87=(Token)match(input,ID,FOLLOW_ID_in_constraint1150); 
                    ID87_tree = 
                    (Tree)adaptor.create(ID87)
                    ;
                    adaptor.addChild(root_0, ID87_tree);


                    EQ88=(Token)match(input,EQ,FOLLOW_EQ_in_constraint1152); 

                    }
                    break;

            }


            // Velvet.g:182:26: ( constraintDefinition | attributeConstraint )
            int alt26=2;
            switch ( input.LA(1) ) {
            case OP_NOT:
            case START_R:
                {
                alt26=1;
                }
                break;
            case ID:
            case IDPath:
                {
                int LA26_2 = input.LA(2);

                if ( ((LA26_2 >= OP_AND && LA26_2 <= OP_IMPLIES)||(LA26_2 >= OP_OR && LA26_2 <= OP_XOR)||LA26_2==SEMI) ) {
                    alt26=1;
                }
                else if ( (LA26_2==ATTR_OP_EQUALS||LA26_2==ATTR_OP_GREATER_EQ||LA26_2==ATTR_OP_LESS_EQ||LA26_2==MINUS||LA26_2==PLUS) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;

                }
                }
                break;
            case INT:
                {
                alt26=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // Velvet.g:182:27: constraintDefinition
                    {
                    pushFollow(FOLLOW_constraintDefinition_in_constraint1158);
                    constraintDefinition89=constraintDefinition();

                    state._fsp--;

                    adaptor.addChild(root_0, constraintDefinition89.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:182:50: attributeConstraint
                    {
                    pushFollow(FOLLOW_attributeConstraint_in_constraint1162);
                    attributeConstraint90=attributeConstraint();

                    state._fsp--;

                    adaptor.addChild(root_0, attributeConstraint90.getTree());

                    }
                    break;

            }


            SEMI91=(Token)match(input,SEMI,FOLLOW_SEMI_in_constraint1165); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraint"


    public static class constraintDefinition_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraintDefinition"
    // Velvet.g:185:1: constraintDefinition : constraintOperand ( binaryOp constraintOperand )* -> ^( CONSTR ( constraintOperand )+ ( binaryOp )* ) ;
    public final VelvetParser.constraintDefinition_return constraintDefinition() throws RecognitionException {
        VelvetParser.constraintDefinition_return retval = new VelvetParser.constraintDefinition_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.constraintOperand_return constraintOperand92 =null;

        VelvetParser.binaryOp_return binaryOp93 =null;

        VelvetParser.constraintOperand_return constraintOperand94 =null;


        RewriteRuleSubtreeStream stream_constraintOperand=new RewriteRuleSubtreeStream(adaptor,"rule constraintOperand");
        RewriteRuleSubtreeStream stream_binaryOp=new RewriteRuleSubtreeStream(adaptor,"rule binaryOp");
        try {
            // Velvet.g:186:2: ( constraintOperand ( binaryOp constraintOperand )* -> ^( CONSTR ( constraintOperand )+ ( binaryOp )* ) )
            // Velvet.g:186:4: constraintOperand ( binaryOp constraintOperand )*
            {
            pushFollow(FOLLOW_constraintOperand_in_constraintDefinition1178);
            constraintOperand92=constraintOperand();

            state._fsp--;

            stream_constraintOperand.add(constraintOperand92.getTree());

            // Velvet.g:186:22: ( binaryOp constraintOperand )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0 >= OP_AND && LA27_0 <= OP_IMPLIES)||(LA27_0 >= OP_OR && LA27_0 <= OP_XOR)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Velvet.g:186:23: binaryOp constraintOperand
            	    {
            	    pushFollow(FOLLOW_binaryOp_in_constraintDefinition1181);
            	    binaryOp93=binaryOp();

            	    state._fsp--;

            	    stream_binaryOp.add(binaryOp93.getTree());

            	    pushFollow(FOLLOW_constraintOperand_in_constraintDefinition1183);
            	    constraintOperand94=constraintOperand();

            	    state._fsp--;

            	    stream_constraintOperand.add(constraintOperand94.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // AST REWRITE
            // elements: constraintOperand, binaryOp
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 187:2: -> ^( CONSTR ( constraintOperand )+ ( binaryOp )* )
            {
                // Velvet.g:187:5: ^( CONSTR ( constraintOperand )+ ( binaryOp )* )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(CONSTR, "CONSTR")
                , root_1);

                if ( !(stream_constraintOperand.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constraintOperand.hasNext() ) {
                    adaptor.addChild(root_1, stream_constraintOperand.nextTree());

                }
                stream_constraintOperand.reset();

                // Velvet.g:187:33: ( binaryOp )*
                while ( stream_binaryOp.hasNext() ) {
                    adaptor.addChild(root_1, stream_binaryOp.nextTree());

                }
                stream_binaryOp.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraintDefinition"


    public static class constraintOperand_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constraintOperand"
    // Velvet.g:190:1: constraintOperand : ( unaryOp )* ( START_R constraintDefinition END_R | name ) -> ( constraintDefinition )? ( ^( UNARYOP unaryOp ) )* ( ^( OPERAND name ) )? ;
    public final VelvetParser.constraintOperand_return constraintOperand() throws RecognitionException {
        VelvetParser.constraintOperand_return retval = new VelvetParser.constraintOperand_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token START_R96=null;
        Token END_R98=null;
        VelvetParser.unaryOp_return unaryOp95 =null;

        VelvetParser.constraintDefinition_return constraintDefinition97 =null;

        VelvetParser.name_return name99 =null;


        Tree START_R96_tree=null;
        Tree END_R98_tree=null;
        RewriteRuleTokenStream stream_END_R=new RewriteRuleTokenStream(adaptor,"token END_R");
        RewriteRuleTokenStream stream_START_R=new RewriteRuleTokenStream(adaptor,"token START_R");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        RewriteRuleSubtreeStream stream_unaryOp=new RewriteRuleSubtreeStream(adaptor,"rule unaryOp");
        RewriteRuleSubtreeStream stream_constraintDefinition=new RewriteRuleSubtreeStream(adaptor,"rule constraintDefinition");
        try {
            // Velvet.g:190:19: ( ( unaryOp )* ( START_R constraintDefinition END_R | name ) -> ( constraintDefinition )? ( ^( UNARYOP unaryOp ) )* ( ^( OPERAND name ) )? )
            // Velvet.g:190:21: ( unaryOp )* ( START_R constraintDefinition END_R | name )
            {
            // Velvet.g:190:21: ( unaryOp )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OP_NOT) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // Velvet.g:190:21: unaryOp
            	    {
            	    pushFollow(FOLLOW_unaryOp_in_constraintOperand1210);
            	    unaryOp95=unaryOp();

            	    state._fsp--;

            	    stream_unaryOp.add(unaryOp95.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // Velvet.g:190:30: ( START_R constraintDefinition END_R | name )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==START_R) ) {
                alt29=1;
            }
            else if ( ((LA29_0 >= ID && LA29_0 <= IDPath)) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // Velvet.g:190:31: START_R constraintDefinition END_R
                    {
                    START_R96=(Token)match(input,START_R,FOLLOW_START_R_in_constraintOperand1214);  
                    stream_START_R.add(START_R96);


                    pushFollow(FOLLOW_constraintDefinition_in_constraintOperand1216);
                    constraintDefinition97=constraintDefinition();

                    state._fsp--;

                    stream_constraintDefinition.add(constraintDefinition97.getTree());

                    END_R98=(Token)match(input,END_R,FOLLOW_END_R_in_constraintOperand1218);  
                    stream_END_R.add(END_R98);


                    }
                    break;
                case 2 :
                    // Velvet.g:190:68: name
                    {
                    pushFollow(FOLLOW_name_in_constraintOperand1222);
                    name99=name();

                    state._fsp--;

                    stream_name.add(name99.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: name, unaryOp, constraintDefinition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 191:2: -> ( constraintDefinition )? ( ^( UNARYOP unaryOp ) )* ( ^( OPERAND name ) )?
            {
                // Velvet.g:191:5: ( constraintDefinition )?
                if ( stream_constraintDefinition.hasNext() ) {
                    adaptor.addChild(root_0, stream_constraintDefinition.nextTree());

                }
                stream_constraintDefinition.reset();

                // Velvet.g:191:27: ( ^( UNARYOP unaryOp ) )*
                while ( stream_unaryOp.hasNext() ) {
                    // Velvet.g:191:27: ^( UNARYOP unaryOp )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot(
                    (Tree)adaptor.create(UNARYOP, "UNARYOP")
                    , root_1);

                    adaptor.addChild(root_1, stream_unaryOp.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_unaryOp.reset();

                // Velvet.g:191:47: ( ^( OPERAND name ) )?
                if ( stream_name.hasNext() ) {
                    // Velvet.g:191:47: ^( OPERAND name )
                    {
                    Tree root_1 = (Tree)adaptor.nil();
                    root_1 = (Tree)adaptor.becomeRoot(
                    (Tree)adaptor.create(OPERAND, "OPERAND")
                    , root_1);

                    adaptor.addChild(root_1, stream_name.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_name.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constraintOperand"


    public static class attributeConstraint_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attributeConstraint"
    // Velvet.g:194:1: attributeConstraint : attribConstraint -> ^( ACONSTR attribConstraint ) ;
    public final VelvetParser.attributeConstraint_return attributeConstraint() throws RecognitionException {
        VelvetParser.attributeConstraint_return retval = new VelvetParser.attributeConstraint_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.attribConstraint_return attribConstraint100 =null;


        RewriteRuleSubtreeStream stream_attribConstraint=new RewriteRuleSubtreeStream(adaptor,"rule attribConstraint");
        try {
            // Velvet.g:195:2: ( attribConstraint -> ^( ACONSTR attribConstraint ) )
            // Velvet.g:195:4: attribConstraint
            {
            pushFollow(FOLLOW_attribConstraint_in_attributeConstraint1257);
            attribConstraint100=attribConstraint();

            state._fsp--;

            stream_attribConstraint.add(attribConstraint100.getTree());

            // AST REWRITE
            // elements: attribConstraint
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 196:2: -> ^( ACONSTR attribConstraint )
            {
                // Velvet.g:196:5: ^( ACONSTR attribConstraint )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ACONSTR, "ACONSTR")
                , root_1);

                adaptor.addChild(root_1, stream_attribConstraint.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attributeConstraint"


    public static class attribConstraint_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribConstraint"
    // Velvet.g:199:1: attribConstraint : attribNumInstance ( attribOperator attribNumInstance )* attribRelation attribNumInstance ( attribOperator attribNumInstance )* ;
    public final VelvetParser.attribConstraint_return attribConstraint() throws RecognitionException {
        VelvetParser.attribConstraint_return retval = new VelvetParser.attribConstraint_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        VelvetParser.attribNumInstance_return attribNumInstance101 =null;

        VelvetParser.attribOperator_return attribOperator102 =null;

        VelvetParser.attribNumInstance_return attribNumInstance103 =null;

        VelvetParser.attribRelation_return attribRelation104 =null;

        VelvetParser.attribNumInstance_return attribNumInstance105 =null;

        VelvetParser.attribOperator_return attribOperator106 =null;

        VelvetParser.attribNumInstance_return attribNumInstance107 =null;



        try {
            // Velvet.g:200:2: ( attribNumInstance ( attribOperator attribNumInstance )* attribRelation attribNumInstance ( attribOperator attribNumInstance )* )
            // Velvet.g:200:4: attribNumInstance ( attribOperator attribNumInstance )* attribRelation attribNumInstance ( attribOperator attribNumInstance )*
            {
            root_0 = (Tree)adaptor.nil();


            pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1277);
            attribNumInstance101=attribNumInstance();

            state._fsp--;

            adaptor.addChild(root_0, attribNumInstance101.getTree());

            // Velvet.g:200:22: ( attribOperator attribNumInstance )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==MINUS||LA30_0==PLUS) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // Velvet.g:200:23: attribOperator attribNumInstance
            	    {
            	    pushFollow(FOLLOW_attribOperator_in_attribConstraint1280);
            	    attribOperator102=attribOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribOperator102.getTree());

            	    pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1282);
            	    attribNumInstance103=attribNumInstance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribNumInstance103.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            pushFollow(FOLLOW_attribRelation_in_attribConstraint1290);
            attribRelation104=attribRelation();

            state._fsp--;

            adaptor.addChild(root_0, attribRelation104.getTree());

            pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1296);
            attribNumInstance105=attribNumInstance();

            state._fsp--;

            adaptor.addChild(root_0, attribNumInstance105.getTree());

            // Velvet.g:202:22: ( attribOperator attribNumInstance )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==MINUS||LA31_0==PLUS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // Velvet.g:202:23: attribOperator attribNumInstance
            	    {
            	    pushFollow(FOLLOW_attribOperator_in_attribConstraint1299);
            	    attribOperator106=attribOperator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribOperator106.getTree());

            	    pushFollow(FOLLOW_attribNumInstance_in_attribConstraint1301);
            	    attribNumInstance107=attribNumInstance();

            	    state._fsp--;

            	    adaptor.addChild(root_0, attribNumInstance107.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribConstraint"


    public static class attribOperator_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribOperator"
    // Velvet.g:205:1: attribOperator : ( PLUS | MINUS );
    public final VelvetParser.attribOperator_return attribOperator() throws RecognitionException {
        VelvetParser.attribOperator_return retval = new VelvetParser.attribOperator_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set108=null;

        Tree set108_tree=null;

        try {
            // Velvet.g:206:2: ( PLUS | MINUS )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set108=(Token)input.LT(1);

            if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set108)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribOperator"


    public static class attribNumInstance_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribNumInstance"
    // Velvet.g:210:1: attribNumInstance : ( INT | name );
    public final VelvetParser.attribNumInstance_return attribNumInstance() throws RecognitionException {
        VelvetParser.attribNumInstance_return retval = new VelvetParser.attribNumInstance_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token INT109=null;
        VelvetParser.name_return name110 =null;


        Tree INT109_tree=null;

        try {
            // Velvet.g:211:2: ( INT | name )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==INT) ) {
                alt32=1;
            }
            else if ( ((LA32_0 >= ID && LA32_0 <= IDPath)) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // Velvet.g:211:4: INT
                    {
                    root_0 = (Tree)adaptor.nil();


                    INT109=(Token)match(input,INT,FOLLOW_INT_in_attribNumInstance1333); 
                    INT109_tree = 
                    (Tree)adaptor.create(INT109)
                    ;
                    adaptor.addChild(root_0, INT109_tree);


                    }
                    break;
                case 2 :
                    // Velvet.g:213:4: name
                    {
                    root_0 = (Tree)adaptor.nil();


                    pushFollow(FOLLOW_name_in_attribNumInstance1340);
                    name110=name();

                    state._fsp--;

                    adaptor.addChild(root_0, name110.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribNumInstance"


    public static class attribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribute"
    // Velvet.g:216:1: attribute : ( intAttribute | floatAttribute | stringAttribute | boolAttribute ) SEMI -> ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? ) ;
    public final VelvetParser.attribute_return attribute() throws RecognitionException {
        VelvetParser.attribute_return retval = new VelvetParser.attribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token SEMI115=null;
        VelvetParser.intAttribute_return intAttribute111 =null;

        VelvetParser.floatAttribute_return floatAttribute112 =null;

        VelvetParser.stringAttribute_return stringAttribute113 =null;

        VelvetParser.boolAttribute_return boolAttribute114 =null;


        Tree SEMI115_tree=null;
        RewriteRuleTokenStream stream_SEMI=new RewriteRuleTokenStream(adaptor,"token SEMI");
        RewriteRuleSubtreeStream stream_intAttribute=new RewriteRuleSubtreeStream(adaptor,"rule intAttribute");
        RewriteRuleSubtreeStream stream_stringAttribute=new RewriteRuleSubtreeStream(adaptor,"rule stringAttribute");
        RewriteRuleSubtreeStream stream_floatAttribute=new RewriteRuleSubtreeStream(adaptor,"rule floatAttribute");
        RewriteRuleSubtreeStream stream_boolAttribute=new RewriteRuleSubtreeStream(adaptor,"rule boolAttribute");
        try {
            // Velvet.g:217:2: ( ( intAttribute | floatAttribute | stringAttribute | boolAttribute ) SEMI -> ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? ) )
            // Velvet.g:217:4: ( intAttribute | floatAttribute | stringAttribute | boolAttribute ) SEMI
            {
            // Velvet.g:217:4: ( intAttribute | floatAttribute | stringAttribute | boolAttribute )
            int alt33=4;
            switch ( input.LA(1) ) {
            case VAR_INT:
                {
                alt33=1;
                }
                break;
            case VAR_FLOAT:
                {
                alt33=2;
                }
                break;
            case VAR_STRING:
                {
                alt33=3;
                }
                break;
            case VAR_BOOL:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }

            switch (alt33) {
                case 1 :
                    // Velvet.g:217:5: intAttribute
                    {
                    pushFollow(FOLLOW_intAttribute_in_attribute1352);
                    intAttribute111=intAttribute();

                    state._fsp--;

                    stream_intAttribute.add(intAttribute111.getTree());

                    }
                    break;
                case 2 :
                    // Velvet.g:217:20: floatAttribute
                    {
                    pushFollow(FOLLOW_floatAttribute_in_attribute1356);
                    floatAttribute112=floatAttribute();

                    state._fsp--;

                    stream_floatAttribute.add(floatAttribute112.getTree());

                    }
                    break;
                case 3 :
                    // Velvet.g:217:37: stringAttribute
                    {
                    pushFollow(FOLLOW_stringAttribute_in_attribute1360);
                    stringAttribute113=stringAttribute();

                    state._fsp--;

                    stream_stringAttribute.add(stringAttribute113.getTree());

                    }
                    break;
                case 4 :
                    // Velvet.g:217:55: boolAttribute
                    {
                    pushFollow(FOLLOW_boolAttribute_in_attribute1364);
                    boolAttribute114=boolAttribute();

                    state._fsp--;

                    stream_boolAttribute.add(boolAttribute114.getTree());

                    }
                    break;

            }


            SEMI115=(Token)match(input,SEMI,FOLLOW_SEMI_in_attribute1367);  
            stream_SEMI.add(SEMI115);


            // AST REWRITE
            // elements: boolAttribute, stringAttribute, floatAttribute, intAttribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Tree)adaptor.nil();
            // 218:2: -> ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? )
            {
                // Velvet.g:218:5: ^( ATTR ( intAttribute )? ( floatAttribute )? ( stringAttribute )? ( boolAttribute )? )
                {
                Tree root_1 = (Tree)adaptor.nil();
                root_1 = (Tree)adaptor.becomeRoot(
                (Tree)adaptor.create(ATTR, "ATTR")
                , root_1);

                // Velvet.g:218:12: ( intAttribute )?
                if ( stream_intAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_intAttribute.nextTree());

                }
                stream_intAttribute.reset();

                // Velvet.g:218:26: ( floatAttribute )?
                if ( stream_floatAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_floatAttribute.nextTree());

                }
                stream_floatAttribute.reset();

                // Velvet.g:218:42: ( stringAttribute )?
                if ( stream_stringAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_stringAttribute.nextTree());

                }
                stream_stringAttribute.reset();

                // Velvet.g:218:59: ( boolAttribute )?
                if ( stream_boolAttribute.hasNext() ) {
                    adaptor.addChild(root_1, stream_boolAttribute.nextTree());

                }
                stream_boolAttribute.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribute"


    public static class intAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "intAttribute"
    // Velvet.g:221:1: intAttribute : VAR_INT ! name ( EQ ! INT )? ;
    public final VelvetParser.intAttribute_return intAttribute() throws RecognitionException {
        VelvetParser.intAttribute_return retval = new VelvetParser.intAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_INT116=null;
        Token EQ118=null;
        Token INT119=null;
        VelvetParser.name_return name117 =null;


        Tree VAR_INT116_tree=null;
        Tree EQ118_tree=null;
        Tree INT119_tree=null;

        try {
            // Velvet.g:221:13: ( VAR_INT ! name ( EQ ! INT )? )
            // Velvet.g:221:16: VAR_INT ! name ( EQ ! INT )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_INT116=(Token)match(input,VAR_INT,FOLLOW_VAR_INT_in_intAttribute1396); 

            pushFollow(FOLLOW_name_in_intAttribute1399);
            name117=name();

            state._fsp--;

            adaptor.addChild(root_0, name117.getTree());

            // Velvet.g:221:30: ( EQ ! INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==EQ) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // Velvet.g:221:31: EQ ! INT
                    {
                    EQ118=(Token)match(input,EQ,FOLLOW_EQ_in_intAttribute1402); 

                    INT119=(Token)match(input,INT,FOLLOW_INT_in_intAttribute1405); 
                    INT119_tree = 
                    (Tree)adaptor.create(INT119)
                    ;
                    adaptor.addChild(root_0, INT119_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "intAttribute"


    public static class floatAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "floatAttribute"
    // Velvet.g:222:1: floatAttribute : VAR_FLOAT ! name ( EQ ! FLOAT )? ;
    public final VelvetParser.floatAttribute_return floatAttribute() throws RecognitionException {
        VelvetParser.floatAttribute_return retval = new VelvetParser.floatAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_FLOAT120=null;
        Token EQ122=null;
        Token FLOAT123=null;
        VelvetParser.name_return name121 =null;


        Tree VAR_FLOAT120_tree=null;
        Tree EQ122_tree=null;
        Tree FLOAT123_tree=null;

        try {
            // Velvet.g:222:15: ( VAR_FLOAT ! name ( EQ ! FLOAT )? )
            // Velvet.g:222:18: VAR_FLOAT ! name ( EQ ! FLOAT )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_FLOAT120=(Token)match(input,VAR_FLOAT,FOLLOW_VAR_FLOAT_in_floatAttribute1414); 

            pushFollow(FOLLOW_name_in_floatAttribute1417);
            name121=name();

            state._fsp--;

            adaptor.addChild(root_0, name121.getTree());

            // Velvet.g:222:34: ( EQ ! FLOAT )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==EQ) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // Velvet.g:222:35: EQ ! FLOAT
                    {
                    EQ122=(Token)match(input,EQ,FOLLOW_EQ_in_floatAttribute1420); 

                    FLOAT123=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_floatAttribute1423); 
                    FLOAT123_tree = 
                    (Tree)adaptor.create(FLOAT123)
                    ;
                    adaptor.addChild(root_0, FLOAT123_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "floatAttribute"


    public static class stringAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringAttribute"
    // Velvet.g:223:1: stringAttribute : VAR_STRING ! name ( EQ ! STRING )? ;
    public final VelvetParser.stringAttribute_return stringAttribute() throws RecognitionException {
        VelvetParser.stringAttribute_return retval = new VelvetParser.stringAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_STRING124=null;
        Token EQ126=null;
        Token STRING127=null;
        VelvetParser.name_return name125 =null;


        Tree VAR_STRING124_tree=null;
        Tree EQ126_tree=null;
        Tree STRING127_tree=null;

        try {
            // Velvet.g:223:16: ( VAR_STRING ! name ( EQ ! STRING )? )
            // Velvet.g:223:18: VAR_STRING ! name ( EQ ! STRING )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_STRING124=(Token)match(input,VAR_STRING,FOLLOW_VAR_STRING_in_stringAttribute1431); 

            pushFollow(FOLLOW_name_in_stringAttribute1434);
            name125=name();

            state._fsp--;

            adaptor.addChild(root_0, name125.getTree());

            // Velvet.g:223:35: ( EQ ! STRING )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EQ) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // Velvet.g:223:36: EQ ! STRING
                    {
                    EQ126=(Token)match(input,EQ,FOLLOW_EQ_in_stringAttribute1437); 

                    STRING127=(Token)match(input,STRING,FOLLOW_STRING_in_stringAttribute1440); 
                    STRING127_tree = 
                    (Tree)adaptor.create(STRING127)
                    ;
                    adaptor.addChild(root_0, STRING127_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringAttribute"


    public static class boolAttribute_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolAttribute"
    // Velvet.g:224:1: boolAttribute : VAR_BOOL ! name ( EQ ! BOOLEAN )? ;
    public final VelvetParser.boolAttribute_return boolAttribute() throws RecognitionException {
        VelvetParser.boolAttribute_return retval = new VelvetParser.boolAttribute_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token VAR_BOOL128=null;
        Token EQ130=null;
        Token BOOLEAN131=null;
        VelvetParser.name_return name129 =null;


        Tree VAR_BOOL128_tree=null;
        Tree EQ130_tree=null;
        Tree BOOLEAN131_tree=null;

        try {
            // Velvet.g:224:14: ( VAR_BOOL ! name ( EQ ! BOOLEAN )? )
            // Velvet.g:224:17: VAR_BOOL ! name ( EQ ! BOOLEAN )?
            {
            root_0 = (Tree)adaptor.nil();


            VAR_BOOL128=(Token)match(input,VAR_BOOL,FOLLOW_VAR_BOOL_in_boolAttribute1449); 

            pushFollow(FOLLOW_name_in_boolAttribute1452);
            name129=name();

            state._fsp--;

            adaptor.addChild(root_0, name129.getTree());

            // Velvet.g:224:32: ( EQ ! BOOLEAN )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==EQ) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // Velvet.g:224:33: EQ ! BOOLEAN
                    {
                    EQ130=(Token)match(input,EQ,FOLLOW_EQ_in_boolAttribute1455); 

                    BOOLEAN131=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolAttribute1458); 
                    BOOLEAN131_tree = 
                    (Tree)adaptor.create(BOOLEAN131)
                    ;
                    adaptor.addChild(root_0, BOOLEAN131_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolAttribute"


    public static class unaryOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryOp"
    // Velvet.g:226:1: unaryOp : OP_NOT ;
    public final VelvetParser.unaryOp_return unaryOp() throws RecognitionException {
        VelvetParser.unaryOp_return retval = new VelvetParser.unaryOp_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token OP_NOT132=null;

        Tree OP_NOT132_tree=null;

        try {
            // Velvet.g:227:2: ( OP_NOT )
            // Velvet.g:227:4: OP_NOT
            {
            root_0 = (Tree)adaptor.nil();


            OP_NOT132=(Token)match(input,OP_NOT,FOLLOW_OP_NOT_in_unaryOp1470); 
            OP_NOT132_tree = 
            (Tree)adaptor.create(OP_NOT132)
            ;
            adaptor.addChild(root_0, OP_NOT132_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unaryOp"


    public static class binaryOp_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "binaryOp"
    // Velvet.g:230:1: binaryOp : ( OP_AND | OP_OR | OP_XOR | OP_IMPLIES | OP_EQUIVALENT );
    public final VelvetParser.binaryOp_return binaryOp() throws RecognitionException {
        VelvetParser.binaryOp_return retval = new VelvetParser.binaryOp_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set133=null;

        Tree set133_tree=null;

        try {
            // Velvet.g:231:2: ( OP_AND | OP_OR | OP_XOR | OP_IMPLIES | OP_EQUIVALENT )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set133=(Token)input.LT(1);

            if ( (input.LA(1) >= OP_AND && input.LA(1) <= OP_IMPLIES)||(input.LA(1) >= OP_OR && input.LA(1) <= OP_XOR) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set133)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "binaryOp"


    public static class attribRelation_return extends ParserRuleReturnScope {
        Tree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "attribRelation"
    // Velvet.g:238:1: attribRelation : ( ATTR_OP_EQUALS | ATTR_OP_GREATER_EQ | ATTR_OP_LESS_EQ );
    public final VelvetParser.attribRelation_return attribRelation() throws RecognitionException {
        VelvetParser.attribRelation_return retval = new VelvetParser.attribRelation_return();
        retval.start = input.LT(1);


        Tree root_0 = null;

        Token set134=null;

        Tree set134_tree=null;

        try {
            // Velvet.g:239:2: ( ATTR_OP_EQUALS | ATTR_OP_GREATER_EQ | ATTR_OP_LESS_EQ )
            // Velvet.g:
            {
            root_0 = (Tree)adaptor.nil();


            set134=(Token)input.LT(1);

            if ( input.LA(1)==ATTR_OP_EQUALS||input.LA(1)==ATTR_OP_GREATER_EQ||input.LA(1)==ATTR_OP_LESS_EQ ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Tree)adaptor.create(set134)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Tree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Tree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "attribRelation"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\21\uffff";
    static final String DFA7_eofS =
        "\5\uffff\1\11\1\14\10\uffff\1\11\1\14";
    static final String DFA7_minS =
        "\1\44\4\42\2\22\1\42\2\uffff\1\42\2\uffff\2\42\2\22";
    static final String DFA7_maxS =
        "\1\45\2\42\2\43\2\74\1\42\2\uffff\1\42\2\uffff\2\43\2\74";
    static final String DFA7_acceptS =
        "\10\uffff\1\1\1\4\1\uffff\1\2\1\3\4\uffff";
    static final String DFA7_specialS =
        "\21\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\1\2",
            "\1\3",
            "\1\4",
            "\2\5",
            "\2\6",
            "\1\7\22\uffff\1\10\1\11\25\uffff\1\11",
            "\1\12\21\uffff\1\13\1\uffff\1\14\25\uffff\1\14",
            "\1\15",
            "",
            "",
            "\1\16",
            "",
            "",
            "\2\17",
            "\2\20",
            "\1\7\22\uffff\1\10\1\11\25\uffff\1\11",
            "\1\12\21\uffff\1\13\1\uffff\1\14\25\uffff\1\14"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "96:4: ( instanceImports interfaceImports | interfaceImports instanceImports | interfaceImports | instanceImports )";
        }
    }
 

    public static final BitSet FOLLOW_concept_in_velvetModel489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_cinterface_in_velvetModel491 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_velvetModel494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONCEPT_in_concept507 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_concept509 = new BitSet(new long[]{0x1000003000020402L});
    public static final BitSet FOLLOW_ATTR_OP_LESS_in_concept516 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_conceptBaseSpec_in_concept518 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_definitionsSpec_in_concept520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLON_in_concept528 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_conceptBaseExt_in_concept530 = new BitSet(new long[]{0x1000003000000002L});
    public static final BitSet FOLLOW_parameter_in_concept534 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_definitions_in_concept540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instanceImports_in_parameter575 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_interfaceImports_in_parameter577 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_interfaceImports_in_parameter581 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_instanceImports_in_parameter583 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_interfaceImports_in_parameter587 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_instanceImports_in_parameter591 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_referenceImports_in_parameter594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_conceptBaseExt622 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_conceptBaseExt625 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_conceptBaseExt627 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ID_in_conceptBaseSpec652 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_conceptBaseSpec655 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_conceptBaseSpec657 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORTINSTANCE_in_instanceImports681 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_instanceImports683 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_instanceImports685 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_instanceImports688 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_instanceImports690 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_instanceImports692 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORTINTERFACE_in_interfaceImports721 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_interfaceImports723 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_interfaceImports725 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_interfaceImports728 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_interfaceImports730 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_interfaceImports732 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IMPORTREFERENCE_in_referenceImports760 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_referenceImports762 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_referenceImports764 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_referenceImports768 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_referenceImports770 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_referenceImports772 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_CINTERFACE_in_cinterface800 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_cinterface802 = new BitSet(new long[]{0x1000000000020000L});
    public static final BitSet FOLLOW_COLON_in_cinterface806 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_interfaceBaseExt_in_cinterface808 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_definitions_in_cinterface812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_interfaceBaseExt839 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_COMMA_in_interfaceBaseExt842 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_interfaceBaseExt844 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_START_C_in_definitions884 = new BitSet(new long[]{0x0800440041200010L,0x000000000000007AL});
    public static final BitSet FOLLOW_definition_in_definitions886 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_END_C_in_definitions888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_START_C_in_definitionsSpec911 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_constraint_in_definitionsSpec913 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_END_C_in_definitionsSpec916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_nonFeatureDefinition_in_definition940 = new BitSet(new long[]{0x0800440040200012L,0x000000000000007AL});
    public static final BitSet FOLLOW_featureGroup_in_definition948 = new BitSet(new long[]{0x0000000000200002L,0x000000000000007AL});
    public static final BitSet FOLLOW_nonFeatureDefinition_in_definition950 = new BitSet(new long[]{0x0000000000200002L,0x000000000000007AL});
    public static final BitSet FOLLOW_feature_in_definition959 = new BitSet(new long[]{0x0000040040200012L,0x000000000000007AL});
    public static final BitSet FOLLOW_feature_in_definition962 = new BitSet(new long[]{0x0000040040200012L,0x000000000000007AL});
    public static final BitSet FOLLOW_nonFeatureDefinition_in_definition966 = new BitSet(new long[]{0x0000040040200012L,0x000000000000007AL});
    public static final BitSet FOLLOW_constraint_in_nonFeatureDefinition988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_use_in_nonFeatureDefinition993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_nonFeatureDefinition998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_USE_in_use1010 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_use1012 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_use1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MANDATORY_in_feature1035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ABSTRACT_in_feature1037 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_feature1041 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_MANDATORY_in_feature1043 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_MANDATORY_in_feature1047 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ABSTRACT_in_feature1051 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FEATURE_in_feature1058 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_feature1060 = new BitSet(new long[]{0x1200000000000000L});
    public static final BitSet FOLLOW_definitions_in_feature1063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEMI_in_feature1067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_groupType_in_featureGroup1098 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_START_C_in_featureGroup1100 = new BitSet(new long[]{0x0000040040000010L});
    public static final BitSet FOLLOW_feature_in_featureGroup1102 = new BitSet(new long[]{0x0000040041000010L});
    public static final BitSet FOLLOW_END_C_in_featureGroup1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONSTRAINT_in_constraint1146 = new BitSet(new long[]{0x2008010C00000000L});
    public static final BitSet FOLLOW_ID_in_constraint1150 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQ_in_constraint1152 = new BitSet(new long[]{0x2008010C00000000L});
    public static final BitSet FOLLOW_constraintDefinition_in_constraint1158 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_attributeConstraint_in_constraint1162 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_constraint1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constraintOperand_in_constraintDefinition1178 = new BitSet(new long[]{0x0037000000000002L});
    public static final BitSet FOLLOW_binaryOp_in_constraintDefinition1181 = new BitSet(new long[]{0x2008000C00000000L});
    public static final BitSet FOLLOW_constraintOperand_in_constraintDefinition1183 = new BitSet(new long[]{0x0037000000000002L});
    public static final BitSet FOLLOW_unaryOp_in_constraintOperand1210 = new BitSet(new long[]{0x2008000C00000000L});
    public static final BitSet FOLLOW_START_R_in_constraintOperand1214 = new BitSet(new long[]{0x2008000C00000000L});
    public static final BitSet FOLLOW_constraintDefinition_in_constraintOperand1216 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_END_R_in_constraintOperand1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_constraintOperand1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribConstraint_in_attributeConstraint1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1277 = new BitSet(new long[]{0x0080080000000A80L});
    public static final BitSet FOLLOW_attribOperator_in_attribConstraint1280 = new BitSet(new long[]{0x0000010C00000000L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1282 = new BitSet(new long[]{0x0080080000000A80L});
    public static final BitSet FOLLOW_attribRelation_in_attribConstraint1290 = new BitSet(new long[]{0x0000010C00000000L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1296 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_attribOperator_in_attribConstraint1299 = new BitSet(new long[]{0x0000010C00000000L});
    public static final BitSet FOLLOW_attribNumInstance_in_attribConstraint1301 = new BitSet(new long[]{0x0080080000000002L});
    public static final BitSet FOLLOW_INT_in_attribNumInstance1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_name_in_attribNumInstance1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intAttribute_in_attribute1352 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_floatAttribute_in_attribute1356 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_stringAttribute_in_attribute1360 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_boolAttribute_in_attribute1364 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_SEMI_in_attribute1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_INT_in_intAttribute1396 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_intAttribute1399 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_intAttribute1402 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_INT_in_intAttribute1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_FLOAT_in_floatAttribute1414 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_floatAttribute1417 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_floatAttribute1420 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FLOAT_in_floatAttribute1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_STRING_in_stringAttribute1431 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_stringAttribute1434 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_stringAttribute1437 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_STRING_in_stringAttribute1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_BOOL_in_boolAttribute1449 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_name_in_boolAttribute1452 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_EQ_in_boolAttribute1455 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolAttribute1458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OP_NOT_in_unaryOp1470 = new BitSet(new long[]{0x0000000000000002L});

}